package examp07;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutputStreamEx {

	public static void main(String[] args) throws Exception {
		//파일 객체 생성
		File file = new File("D:\\Temp\\primiriveData.dat");
		//주 스트림 생성
		FileOutputStream fOutputStream = new FileOutputStream(file);
		System.out.println("파일의 크기 : " + file.length());
		
		//보조 스트림 연결
		//기본타입(int, long, double, float, String..등) 출력을 하기 위한 스트림이 DataOutputStream이다.
		DataOutputStream dOutputStream = new DataOutputStream(fOutputStream);
		
		
		//String을 파일에 저장하기 위해서 writeUTF()를 사용하는데, 한글은 3바이트,  영문자는 1바이트
		//하지만, String내보낼 경우 2바이트가 포함된다. 
		dOutputStream.writeUTF("신은혁"); //String(2바이트)+한글9바이트 = 11바이트 추가
		System.out.println("신은혁 저장 후 파일의 크기  : " + file.length() + "byte");
		dOutputStream.writeDouble(100.15);  //Double은 8바이트이기 때문에 위에 신은혁파일크기 + Double(8바이트 추가)
		System.out.println("Double100.15의 파일 크기  : " + file.length() + "byte");
		dOutputStream.writeInt(700);  //Int는 4바이트 이기때문에 4바이트 또 추가!
		System.out.println("Int700의 파일 크기  : " + file.length() + "byte");
		
		
 
		dOutputStream.writeUTF("Kim");  // String(2바이트)+영문3바이트 = 5바이트 추가
		System.out.println("Kim 저장 후 파일의 크기  : " + file.length() + "byte"); 
		dOutputStream.writeDouble(717.15);  
		System.out.println("Double717.15의 파일 크기  : " + file.length() + "byte");
		dOutputStream.writeInt(555); 
		System.out.println("Int555의 파일 크기  : " + file.length() + "byte");
		
		dOutputStream.flush();
		fOutputStream.close();
		dOutputStream.close();
		
		System.out.println();
		System.out.println("읽어오는 데이터 출력");
		//주스트림 생성
		FileInputStream fInputStream = new FileInputStream(file);
		//보조 스트림 연결
		DataInputStream dinputStream = new DataInputStream(fInputStream);
		
		
		//프로그램으로 읽어들일 때에는 저장할때의 순서와 반드시 똑같이 동일하게 읽어와야 한다.(중요함)
		for(int i=0; i<2; i++) {
			System.out.println( (i+1) + "읽은 문자열 : " + dinputStream.readUTF()); //신은혁을 읽어옴  위에 입력한 순서대로 똑같이 읽어야한다. 안그러면 출력했을때 나오지 않은다.
			System.out.println( (i+1) + "읽은 Double : " + dinputStream.readDouble());
			System.out.println( (i+1) + "읽은 Int: " + dinputStream.readInt());
		}
		
		System.out.println("파일크기 (byte) " + file.length() + "byte읽었습니다.");
		
		fInputStream.close();
		dinputStream.close();
		
	}

}
