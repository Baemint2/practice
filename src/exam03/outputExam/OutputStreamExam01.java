package exam03.outputExam;

import java.io.*;

// 1. txt 파일로부터 한줄씩 입력받아 화면에 출력한다.
public class OutputStreamExam01 {
    public static void main(String[] args) {

        File f = new File(args[0]);
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
        }catch (FileNotFoundException ex) {
            System.out.println("파일이 없습니다. " + ex);
        }catch (IOException e) {
            System.out.println("내용이 없습니다. " + e);
        }
    }
}
