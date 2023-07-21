import java.util.*;

class nameCompare implements Comparator<nameCompare> {

    int rollNo;
    String name;

    nameCompare(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    int getRollNo() {
        return rollNo;
    }

    String getName() {
        return name;
    }

    public int compare(nameCompare s1, nameCompare s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class ComparatorP {
    public static void main(String[] args) {
        ArrayList<nameCompare> al = new ArrayList<nameCompare>();
        Scanner sc = new Scanner(System.in);
        int r;
        String s;
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of student " + (i + 1));
            s = sc.next();
            System.out.println("Enter the roll no." + (i + 1));
            r = sc.nextInt();
            al.add(new nameCompare(r, s));
        }
        nameCompare nc = new nameCompare(0, "");
        Collections.sort(al, nc);
        System.out.println("\nSorting Students Name Wise: ");
        for (nameCompare stu : al) {
            System.out.println("Roll Number:- " + stu.getRollNo() + "\tName:- " + stu.getName());
        }
        sc.close();
    }
}