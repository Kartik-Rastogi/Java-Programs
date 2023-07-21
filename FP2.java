import java.util.*;
import java.net.URL;

public class FP2 {
    public static void main(String[] args) throws Exception {
        URL url1 = new URL("https://apex.oracle.com/en/");
        URL url2 = new URL("http://bvicam.in/search/node/faculty");
        System.out.println("URL is : " + url1.toString());
        System.out.println("protocol is: " + url1.getProtocol());
        System.out.println("file name is: " + url1.getFile());
        System.out.println("host is: " + url1.getHost());
        System.out.println("path is: " + url1.getPath());
        System.out.println("port is: " + url1.getPort());
        System.out.println("default port is: " + url1.getDefaultPort());
        System.out.println("\n");
        System.out.println("URL is : " + url2.toString());
        System.out.println("protocol is: " + url2.getProtocol());
        System.out.println("file name is: " + url2.getFile());
        System.out.println("host is: " + url2.getHost());
        System.out.println("path is: " + url2.getPath());
        System.out.println("port is: " + url2.getPort());
        System.out.println("default port is: " + url2.getDefaultPort());
    }

}