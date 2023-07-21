import java.util.*;

class Student implements Comparable<Student> {
	int roll;
	String name;

	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int compareTo(Student st) {
		if (roll == st.roll)
			return 0;
		else if (roll > st.roll)
			return 1;
		else
			return -1;
	}
}

public class comparableP {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int r;
		String s;
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the name of student " + i);
			s = sc.next();
			System.out.println("Enter the roll no.");
			r = sc.nextInt();
			al.add(new Student(r, s));
		}
		Collections.sort(al);
		System.out.println("\nSorting Students roll number wise: ");
		for (Student st : al) {
			System.out.println("Roll Number:- " + st.roll + " Name:- " + st.name);
		}
		sc.close();
	}
}