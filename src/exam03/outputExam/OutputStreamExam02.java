package exam03.outputExam;

import java.io.*;

public class OutputStreamExam02 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("파일을 명령 행 인수로 넣어주세요.");
            System.exit(0);
        }

        File f = new File(args[0]);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

            String line;
            System.out.println("텍스트를 입력하세요. ('종료')를 누르면 프로그램이 종료됩니다.): ");

            while ((line = br.readLine()) != null) {
                if ("종료".equals(line)) {
                    break;
                }
                bw.write(line); // 파일에 쓰기
                bw.newLine(); // 새 줄 추가
                bw.flush();
            }
        } catch (IOException e) {
            System.out.println("입력을 할 파일이 없습니다. " + e);
        }
    }
}
