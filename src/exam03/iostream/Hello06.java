package exam03.iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Hello06 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/tmp/my.txt")));

//        String line1 = br.readLine();
//        String line2 = br.readLine();
//        String line3 = br.readLine();
//        String line4 = br.readLine(); // null 반환
//        System.out.println(line1);
//        System.out.println(line2);
//        System.out.println(line3);
//        System.out.println(line4);
//
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
