package ch18;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("5000 번 포트에 서버가 대기중.");
			Socket connection = server.accept();
			System.out.println("클라이언트와 연결됨....");
			InputStream is = connection.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			String message = (String) ois.readObject();
			System.out.println("받은 문자열 : " + message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
