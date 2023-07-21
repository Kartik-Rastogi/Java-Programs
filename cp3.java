import java.util.Scanner;

public class cp3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double total = 0.0;
        System.out.println("Enter the number of students:- ");
        int numStudents = sc.nextInt();
        System.out.println("\nEnter the marks between (0 to 100):- ");
        int grades[] = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int marks = sc.nextInt();
            grades[i] = +marks;
        }

        for (int i = 0; i < numStudents; i++) {
            total += grades[i];
        }

        System.out.println("\nAverage of " + grades.length + " Students:- " + (total / numStudents));
        for (int j = 0; j < numStudents; j++) {
            for (int k = j + 1; k < numStudents; k++) {
                if (grades[j] > grades[k]) {
                    int temp = grades[j];
                    grades[j] = grades[k];
                    grades[k] = temp;
                }
            }
        }
        System.out.println("Marks of " + grades.length + " Students:- ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println("\nMinimum Marks:- " + grades[0]);
        System.out.println("Maximum Marks:- " + grades[numStudents - 1]);
        sc.close();
    }
}