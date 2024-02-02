package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9090);


        // 클라이언트를 대기한다.
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 socket 반환
        System.out.println("클라이언트 접속을 기다립니다.");
        Socket socket = ss.accept();

        // 클라이언트와 읽고 쓸수 있는 InputStream, OutputStream
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();
        List<String> headers = new ArrayList<>();
        String line = null;
        while (!(line = br.readLine()).equals("")) {
            headers.add(line);
        }

        System.out.println(firstLine);
        for (int i = 0; i < headers.size(); i++) {
            System.out.println(headers.get(i));
        }

        // 서버에게 응답 메시지 보내기
        // HTTP/1.1 200 OK
        pw.println("HTTP/1.1 200OK");
        pw.println("name : kim");
        pw.println("email : qofndlwl@gmail.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>Hello!</h1>");
        pw.println("</html>");
        pw.close();

        ss.close();
        System.out.println("서버가 종료됩니다.");
    }
}
