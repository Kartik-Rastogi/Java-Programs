import java.io.*;
import java.util.*;

class Student implements Serializable{
    private static final long SerialVersionUID=101;
    int sid;
    String name;
    String phone;
    transient int subject=5;
    
    Student(int sid,String name, String phone){
        this.sid=sid;
        this.name=name;
        this.phone=phone;
        subject=10; //initializing transient variable
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "\n sid=" + sid +
                ",\n name='" + name + '\'' +
                ",\n phone='" + phone + '\'' +
                ",\n subject=" + subject +
                "}\n";
    }
}

class IdSort implements Comparator<Student>{
    public int compare(Student o1, Student o2){
        if(o1.sid < o2.sid)
            return -1;
        else
            return 1;
    }
}
class NameSort implements Comparator<Student>{
    public int compare(Student o1, Student o2){
        return (o1.name.compareTo(o2.name));
    }
}

class PhoneSort implements Comparator<Student>{
    public int compare(Student o1, Student o2){
        return (o1.phone.compareTo(o2.phone));
    }
}

public class HP3 {
    public static void main(String[] args) throws Exception {
        //Serialization of Student Object
        Student s1=new Student(1,"Kartik","+919999008877");
        Student s2=new Student(2,"Harsh","+918899333881");
        Student s3=new Student(3,"Naman","+917678992990");

        FileOutputStream fos=new FileOutputStream("file1.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();
        fos.close();

        //Deserialization Of Student Object
        List<Student> studentList=new ArrayList<>();
        Student s1Deserialized;
        Student s2Deserialized;
        Student s3Deserialized;

        FileInputStream fis=new FileInputStream("file1.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);

        s1Deserialized=(Student)ois.readObject();
        s2Deserialized=(Student)ois.readObject();
        s3Deserialized=(Student)ois.readObject();

        studentList.add(s1Deserialized);
        studentList.add(s2Deserialized);
        studentList.add(s3Deserialized);

        System.out.println("Original Students List: "+studentList);

        // Sorting via Student ID:
        Collections.sort(studentList,new IdSort());
        System.out.println("\nSort By Id: "+ studentList);

        //Sorting by Name:
        Collections.sort(studentList,new NameSort());
        System.out.println("\nSort by Name: "+ studentList);

        //Sorting by Phone:
        Collections.sort(studentList,new PhoneSort());
        System.out.println("\nSort by Phone: "+ studentList);
    }

}