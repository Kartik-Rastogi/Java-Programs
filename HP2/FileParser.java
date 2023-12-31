import java.io.*;
import java.util.Scanner;

public class FileParser {

    public void searchWord(String s){
        int count = 0;
        String st;
        Scanner sc = new Scanner(System.in);

        try{
            FileWriter fw = new FileWriter("test.txt");
            fw.write(s);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Word for Search: ");
        String word = sc.nextLine();

        try{
            RandomAccessFile accessFile = new RandomAccessFile(new File("test.txt"), "r");
            while((st = accessFile.readLine())!=null){
                String[] str = st.split(" ");

                for(String a : str){
                    if(a.equals(word)){
                        count++;
                    }
                }
            }
            System.out.println("Total count of word \"" + word + "\" is  " + count);
            accessFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String text = "Dwelling and speedily ignorant any steepest. Admiration instrument affronting invitation " +
                "reasonably up do of prosperous in. Shy saw declared age debating ecstatic man. Call in so want pure " +
                "rank am dear were. Remarkably to continuing in surrounded diminution on. In unfeeling existence objection " +
                "immediate repulsive on he in. Imprudence comparison uncommonly me he difficulty diminution resolution. " +
                "Likewise proposal differed scarcely dwelling as on raillery. September few dependent extremity own continued " +
                "and ten prevailed attending. Early to weeks we could. " +
                "Unpleasant astonished an diminution up partiality. Noisy an their of meant. Death means up civil " +
                "do an offer wound of. Called square an in afraid direct. Resolution diminution conviction so mr at " +
                "unpleasing simplicity no. No it as breakfast up conveying earnestly immediate principle. Him son disposed " +
                "produced humoured overcame she bachelor improved. Studied however out wishing but inhabit fortune windows ";

        FileParser fp = new FileParser();
        fp.searchWord(text);

    }
}
