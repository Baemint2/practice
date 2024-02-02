package exam03.iostream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOExam01 {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // 키보드 : System.in (InputStream 주인공 )
        // 화면에 출력 : System.out (PrintStream 주인공 )
        // 키보드로 입력받는다는건 문자를 입력 받는것 : char 단위 입출력
        // char 단위 입출력 클래스는 Reader, Writer
        // 한줄 읽기 : BufferedReader 라는 클래스는 readLine 이라는 메소드를 가지고 있다.
        //           더이상 읽어들일것이 없으면(EOF) null 을 반환
        //           장식! (장식은 주인공이 있어야 한다.)
        // 한줄 쓰기 : PrintStream, PrintWriter


        // BufferedReader x
        // CharReader x 우리는 키보드로부터 입력 받아야함
        // FilterReader x - 장식,
        // InputStreamReader(InputStream in) - 장식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println("읽어들인 값 : " + line);
        }

    }
}