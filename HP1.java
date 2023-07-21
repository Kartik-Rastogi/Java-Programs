import java.io.*;

public class HP1 {
    public void readVCS() {
        BufferedWriter bw = null;
        BufferedReader br = null;
        String line = null;
        char ch = ' ';
        int consonants = 0, vowels = 0, spaces = 0;

        try {
            // creating object to read from initial file
            br = new BufferedReader(new FileReader("D:/Java Programs/kartik.txt"));
            // creating object to write output in another file
            bw = new BufferedWriter(new FileWriter("test2.txt", true));
            // reading text from file
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    ch = line.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        vowels++;
                    } else if (ch == ' ') {
                        spaces++;
                    } else {
                        consonants++;
                    }
                }
                // printing output to console
                System.out.println("Line:- '" + line + "'");
                System.out.println("Vowels: " + vowels);
                System.out.println("Consonants: " + consonants);
                System.out.println("Spaces: " + spaces);
                System.out.println("---------------------------------");

                try {
                    // writing output to second file
                    bw.write("Line:- '" + line + "'");
                    bw.write("\nVowels: " + vowels);
                    bw.write("\nConsonants: " + consonants);
                    bw.write("\nSpaces: " + spaces);
                    bw.write("\n---------------------------------");
                } catch (Exception e) {
                    System.out.println("bw:- " + e);
                }

                vowels = 0;
                consonants = 0;
                spaces = 0;
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("br:- " + e);
        }
    }

    public static void main(String[] args) {
        HP1 st = new HP1();
        st.readVCS();
    }
}
