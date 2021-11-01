package examp02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2byteStream {

	public static void main(String[] args) {
		Path fp = Paths.get("data.dat");
		//출력
		try(DataOutputStream out = new DataOutputStream(Files.newOutputStream(fp))){
			out.writeInt(370);
			out.writeDouble(3.14);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//입력
		try(DataInputStream in = new DataInputStream(Files.newInputStream(fp))){
			int num1 = in.readInt();
			double num2 = in.readDouble();
			System.out.println(num1);
			System.out.println(num2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
