package Question1_120;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Examp22 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.print ( "Enter GDP :");
		int GDP = Integer.parseInt (br.readLine());  
		//parseInt(String)으로 받아서 Int형으로 바꾼다.
		//String readLine() 한줄을 읽는다. "\n", "\r"을 만날때 까지 읽어온다.



//		int GDP = br.read(); X
	}

}
