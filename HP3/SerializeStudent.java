import java.io.*;
import java.util.*;

class Student implements Serializable{
    int sid;
    String name;
    String phone;
    transient int subject;

    Student(int sid, String name, String phone){
        this.sid = sid;
        this.name = name;
        this.phone = phone;
        subject = 6;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", subject=" + subject +
                '}' + "\n";
    }

    static class IdSort implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.sid, s2.sid);
        }
    }

    static class NameSort implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

    static class PhoneSort implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.phone.compareTo(s2.phone);
        }
    }
}

public class SerializeStudent  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student[] s = new Student[3];

        s[0] = new Student(1, "Raj", "8786954215");
        s[1] = new Student(2, "Abhi", "9874563258");
        s[2] = new Student(3, "Ashi", "9185769248");

        FileOutputStream fos = new FileOutputStream("fos.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

       for(Student stu : s){
           oos.writeObject(stu);
       }

       oos.close();
       fos.close();

        List<Student> sList = new ArrayList<>();

        FileInputStream fis = new FileInputStream("fos.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student[] s1 = new Student[3];

        for(int i=0; i<3; i++){
            s1[i] = (Student) ois.readObject();
            sList.add(s1[i]);
        }

        System.out.println("List,\n" + sList);
        sList.sort(new Student.IdSort());
        System.out.println("\nSorted By Id,\n" + sList);
        sList.sort(new Student.NameSort());
        System.out.println("\nSorted By Name,\n" + sList);
        sList.sort(new Student.PhoneSort());
        System.out.println("\nSorted By Phone,\n" + sList);
    }
}
