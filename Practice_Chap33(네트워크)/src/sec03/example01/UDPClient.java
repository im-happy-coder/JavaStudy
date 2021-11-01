package sec03.example01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
	
	private String str; //보낼 데이터
	private static int SERVERPORT = 7777; //서버의 포트
	private Scanner scanner = new Scanner(System.in);
	
	//생성자
	public UDPClient(String ip, int port) {
		try {
			InetAddress inetAddress = InetAddress.getByName(ip); //데이타 그램 패킷을 만들 때 필요하다.
			DatagramSocket datagramSocket = new DatagramSocket(port);
			System.out.print("서버에 보낼 내용 : ");
			str = scanner.nextLine();
			
			//인코딩
			byte[] bytes = str.getBytes("UTF-8");
			//보낼 내용을 DatagramPacket으로 만든다.
			DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, SERVERPORT);
			//DatagramSocket을 이용하여 데이터 보낸다.
			datagramSocket.send(datagramPacket);
			
			datagramSocket.close();
		} catch (Exception e) {
			System.out.println("데이터 보내기 실패");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UDPClient("localhost", 9999);//클라이언트의 포트
	}

}
