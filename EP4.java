import java.util.*;
import java.io.*;

class EP4 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Java Programs\\kartik.txt");
        Scanner s = new Scanner(file);

        Map<String, Integer> map = new HashMap<>();
        while (s.hasNext()) {
            String word = s.next();
            int freq = (map.get(word) == null) ? 1 : map.get(word) + 1;
            map.put(word, freq);
        }
        System.out.println(map);
        s.close();
    }
}