package kr.ac.kopo.day18;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {

	public static void main(String[] args) {

		try {

			ServerSocket server = new ServerSocket(10000);
			System.out.println("서버 실행중...");

			Socket client = server.accept();
			System.out.println("연결된 클라이언트 정보 : " + client);
			
			String msg = "접속을 환영합니다";
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os); // 내가 데이타 아웃풋 스트림을 썼으니까 읽어올 땐 무조선 짝을 맞춰야함.

			dos.writeUTF(msg); //진짜 이 메소드를 쓰기 위해 필터를 사용함. 묵시적 형변환
			dos.flush();
			
			client.close();
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
