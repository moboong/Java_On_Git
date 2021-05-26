package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServerMain {

	public static void main(String[] args) {
		
		try {
			
			ServerSocket server = new ServerSocket(10001);
			System.out.println("에코스레드 서버 시작...!");
			
			while(true) {				
				Socket client = server.accept();
				EchoThread et = new EchoThread(client); //소켓을 갖고 스레드 생성
				et.start();
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


class EchoThread extends Thread {
	
	private Socket socket;
	
	public EchoThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		InetAddress client = socket.getInetAddress();
		System.out.println(client);
		
		try {
			
			InputStream is = socket.getInputStream();
			InputStreamReader irs = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(irs);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			while (true) {
				// 클라에서 받아보자 3
				String msg = br.readLine();
				
				if(msg == null) {
					System.out.println("클라이언트 접속을 종료합니다.");
					socket.close();
					break;
				}
				// 그걸 보내보자 4
				bw.write(msg);
				bw.write("\n");
				bw.flush();
				System.out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}