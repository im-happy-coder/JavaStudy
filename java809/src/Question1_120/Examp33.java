package Question1_120;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Examp33 {

	public static void main(String[] args) {
//	Stream.skip(숫자)에서 숫자만큼 아이템을 건너띄고 그 이후의 아이템들로 스트림을 생성합니다.
		int i;
		char c;
		try (FileInputStream fis = new FileInputStream ("D:/course.txt");
		InputStreamReader isr = new InputStreamReader(fis);) {
		while (isr.ready()) { //line n1
		isr.skip(2);  // 공백포함 0부터 2까지  2칸씩 출력함 -----Course : : Java - => ue ja  
		i = isr.read ();
		c = (char) i;
		System.out.print(c);
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	}

