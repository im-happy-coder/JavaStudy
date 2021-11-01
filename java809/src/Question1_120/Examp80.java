package Question1_120;

import java.io.BufferedReader;
import java.io.FileReader;

public class Examp80 {

	public static void main(String[] args) throws Exception {
		BufferedReader brCopy = null;
		try (BufferedReader br = new BufferedReader (new FileReader("D:\\employee.txt"))) { // line n1 
			br.lines().forEach(c -> System.out.println(c)); brCopy = br; //line n2
			}
		brCopy.ready();//line n3;  이문장은 try{}블럭 안에 있어야한다.
		}
	}

//D. The code prints the content of the employee.txt file and throws an exception at line n3.
//답: D.이 코드는 employee.txt 파일의 내용을 인쇄하고 n3 행에서 예외를 발생시킵니다.