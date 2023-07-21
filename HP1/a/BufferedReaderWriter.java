import java.io.*;

public class BufferedReaderWriter {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("old.txt");
            FileWriter fw = new FileWriter("new.txt");

            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);


            int i, vowel = 0, conso = 0, space = 0;
            StringBuilder str = new StringBuilder();

            System.out.println("String in txt file,");

            while((i = br.read())!= -1){
                System.out.print((char)i);

                if((char)i == ' '){
                    space += 1;
                    str.append((char)i);
                }
                else if((char)i == 'a' || (char)i == 'e' || (char)i == 'i' || (char)i == 'o' || (char)i == 'u' ||
                        (char)i == 'A' || (char)i == 'E' || (char)i == 'I' || (char)i == 'O' || (char)i == 'U'){
                    vowel += 1;
                    str.append((char)i);
                }
                else if(Character.isLetter((char)i)){
                    conso += 1;
                    str.append((char)i);
                }
                else if(i == 10){
                    str.append("(vowels - " + vowel + ", consonents - " + conso + ", spaces- " + space + ")");
                    vowel = 0;
                    conso = 0;
                    space = 0;
                    str.append("\n");
                }
            }

            str.append(" (vowels - " + vowel + ", consonents - " + conso + ", spaces- " + space + ")");

            System.out.println("\n\nText written in New File,");
            System.out.println(str);
            bw.write(String.valueOf(str));

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
