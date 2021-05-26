package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 지금은 클라가 하나이지만 클라가 여러 개라고 해봐? 그럼 포트가 클라 갯수만큼 있어야 돼. 그리고 각 포트들에게서 데이터를 주고 받을 때 그냥 받으면 온갖 충돌과 지연이 일어나. 
// 그래서 동시성을 보장하기 위해 필수적으로 서버는 "쓰레드"가 필요해.

public class EchoServerMain {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("에코 서버 실행 시작...");

			Socket client = server.accept();
			System.out.println("접속한 클라이언트 정보 : " + client.getInetAddress().getHostAddress());

			// 클라이언트에서 전송한 데이터를 수신할 수 있는 객체.
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// 수신한 데이터를 클라이언트에 재전송할 객체가 필요.
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			while (true) {
				// 클라에서 받아보자 3
				String msg = br.readLine();
				
				if(msg == null) {
					System.out.println("클라이언트 접속을 종료합니다.");
					client.close();
					break;
				}
				// 그걸 보내보자 4
				// pw.write(msg);
				pw.println(msg);
				pw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
