package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientMain {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 10001); //192.168.217.57

			// 키보드를 입력받을 객체
			// Scanner sc = new Scanner(System.in); //이거도 되는데 밑에처럼 구현해도돼.
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

			// 클라이언트가 (키보드로 입력받은 데이터를) 서버에게 전달하기 위한 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os); // 한글이 입력될 수도 있으니까 필터 꼭 필요해 알지??
			PrintWriter pw = new PrintWriter(osw);

			// 서버에서 재전송한 데이터를 "수신"하기 위한 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				// 키보드 입력 받자 1
				System.out.print("메세지 입력(quit입력 시 종료) : ");
				String msg = keyboard.readLine();
				
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버연결을 종료합니다.");
					socket.close();
					break;
				}

				// 서버에게 전달 2
				//pw.write(msg);
				pw.println(msg);
				pw.flush();

				// 서버에서 메아리 받아서 출력 5
				String echMsg = br.readLine();
				System.out.println("서버에서 돌아온 메세지: " + echMsg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
