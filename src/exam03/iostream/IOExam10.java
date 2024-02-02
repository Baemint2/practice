package exam03.iostream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOExam10 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);

        br.close();
    }
}
