package examp01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TryWithResource {

	public static void main(String[] args) {
//		try-with-resource기반 
//		으로 작성하면 close를 해줄 필요가없다
//		오픈했으면 자동으로 닫아준다.
		try(OutputStream out = new FileOutputStream("data.dat")){
			out.write(7);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
