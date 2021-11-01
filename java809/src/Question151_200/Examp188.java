package Question151_200;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Examp188 {

	public static void main(String[] args) {
//		Given that course.txt is accessible and contains:
//			Course : : Java -
		int i;
		char c;
		try (FileInputStream fis = new FileInputStream ("/course.txt");
		InputStreamReader isr = new InputStreamReader(fis);) {
		while (!isr.close()) { //line n1   while (isr.ready()) 이렇게해야 출력됨
		isr.skip(2); // 공백포함 0부터 2까지  2칸씩 출력함 -----Course : : Java - => ue ja  
		i = isr.read ();
		c = (char) i;
		System.out.print(c);
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	}

//답 :D. A compilation error occurs at line n1.


// 만약   line n1        while (isr.ready()) 이면   ue ja가 출력됨,, 일때의 답 : B. ueJa


//boolean	ready ()스트림이 읽기 가능한가 어떤가를 리턴합니다.
//Stream.skip(숫자)에서 숫자만큼 아이템을 건너띄고 그 이후의 아이템들로 스트림을 생성합니다.
//33번 문제와 똑같음