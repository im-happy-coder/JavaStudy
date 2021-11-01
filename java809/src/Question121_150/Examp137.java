package Question121_150;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examp137 {
//Given that version.txt is accessible and contains:	1234567890

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fis = new FileInputStream("D:/version.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);){
			if(br.markSupported()) {
				System.out.println((char) br.read()); // 1
				br.mark(2); //여기서 현재위치를  mark해놓음 
				System.out.println((char) br.read());//2
				br.reset(); //여기서 mark해놓은 곳으로 이동함
				System.out.println((char) br.read());//2
//				System.out.println((char) br.read());//3
//				System.out.println((char) br.read());//4
//				System.out.println((char) br.read());//5
			}
		}catch (Exception e) {
		e.printStackTrace();
		}
	}

}
/*
boolean	markSupported ()
입력 스트림이 mark 및 reset 메서드를 지원하고 있을지 어떨지를 판정합니다.
BufferedReader클래스는  mark 및 reset 메서드를 지원한다.

 void	mark (int readlimit)
          입력 스트림의 현재 위치에 마크를 설정합니다.
          
  void	reset ()
          이 스트림의 위치를, 입력 스트림로 마지막에 mark 메서드가 불려 갔을 때의 마크 위치에 재설정합니다.
*/