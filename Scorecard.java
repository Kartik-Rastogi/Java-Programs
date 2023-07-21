public class Scorecard {
    public static void main(String args[]) {
        int score = 0;
        char grade;
        System.out.print("The Number of Students & Marks:- \n");
        char studgrade[][] = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'A', 'E', 'B', 'C', 'D', 'D', 'E', 'A', 'A', 'A' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'B', 'B', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'C', 'C', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'D', 'D', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'E', 'D' },
                { 'E', 'E', 'E', 'C', 'C', 'D', 'E', 'B', 'A', 'D' },
                { 'B', 'D', 'E', 'C', 'C', 'D', 'E', 'C', 'A', 'D' },
                { 'D', 'B', 'E', 'C', 'C', 'D', 'E', 'D', 'A', 'D' },
                { 'C', 'B', 'A', 'D', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'A', 'C', 'D', 'E', 'B', 'A', 'C', 'D', 'D' },
                { 'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E' },
                { 'B', 'E', 'A', 'D', 'D', 'D', 'E', 'A', 'A', 'A' } };

        char answerkey[] = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

        for (int i = 0; i < studgrade.length; i++) {
            for (int j = 0; j < answerkey.length; j++) {
                if (studgrade[i][j] == answerkey[j]) {
                    score++;
                }
            }

            if (score <= 10 && score >= 9) {
                grade = 'A';
            } else if (score <= 8 && score >= 7) {
                grade = 'B';
            } else if (score <= 6 && score >= 5) {
                grade = 'C';
            } else if (score <= 4 && score >= 3) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("The score of Student " + (i + 1) + " = " + score + " and the grade = " + grade);
            score = 0;
        }
    }
}
