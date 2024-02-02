package exam03.inputExam;

import think.Person;

import java.io.IOException;
import java.io.InputStream;
/*
1byte가 표현할 수 있는 값 : 00000000 ~ 11111111
파일을 언제까지 읽어야 할지 모를때
byte로는 EOF를 표현할 수 없다.
read() 메소드가 읽어들일 수 있는 정보.
왜 int를 리턴하느냐 이용 하느냐?
byte로 표현하면 EOF를 표현할 수 있는 방법이 없어서.
 */


public class InputStreamExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            int data = in.read();
        } catch(IOException ex) {
            System.out.println("io 오류 : " + ex);
        } finally {
            try {
                in.close();
            } catch (Exception ex2) {
                System.out.println("io 오류2 : " + ex2);
            }
        }

    }
}
/*
키보드로부터 한줄씩 입력받아 화면에 출력하시오.

1. txt 파일로부터 한줄씩 입력받아 화면에 출력한다.
2. 키보드로부터 한줄씩 입력받아 파일에 출력한다. (파일명은 아규먼트로 받아들인다.)
3. txt 파일로 한줄씩 입력받아 다른 파일에 한줄씩 출력한다.
 */