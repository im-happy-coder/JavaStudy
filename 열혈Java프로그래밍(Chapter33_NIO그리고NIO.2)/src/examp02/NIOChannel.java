package examp02;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOChannel {

	public static void main(String[] args) {
		//채널은 버퍼가 없으면 읽수도 쓸수도 없다.
		
		Path src = Paths.get("D:\\data.dat");
		Path dst = Paths.get("D:\\data1.dat");
		
		//하나의 버퍼 생성
		ByteBuffer buf = ByteBuffer.allocate(1024); //non-direct 버퍼 : 파일 -> 운영체제 버퍼 -> 가상머신 버퍼 -> 실행중인 자바 프로그램
//		ByteBuffer buf = ByteBuffer.allocateDirect(1024); // Direct버퍼 : 파일 -> 운영체제 버퍼 -> 실행 중인 자바 프로그램 
		
		
		//try에서 두개의 채널 생성
		try(FileChannel ifc = FileChannel.open(src, StandardOpenOption.READ); //src는 읽을 수 만 있다.
				FileChannel ofc = FileChannel.open(dst, StandardOpenOption.WRITE, StandardOpenOption.CREATE)){ //dst는 쓰기와 생성가능
			int num;
			while(true) {
				num = ifc.read(buf); //채널 ifc에서 버퍼로 읽어 들임
				if(num==-1) // 읽어 들인 데이터가 없다면
					break;
				buf.flip(); //모드 변환!
				ofc.write(buf); //버퍼에서 채널 ofc로 데이터 전송
				buf.clear(); //버퍼 비우기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
