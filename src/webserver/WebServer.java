package webserver;

import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception{
        //클라이언트가 접속할 때까지 대기
        ServerSocket socket = new ServerSocket(9090);
        socket.accept(); //대기한다.
        System.out.println("1");
        Socket clientSocket = socket.accept();
        System.out.println();
    }
}
