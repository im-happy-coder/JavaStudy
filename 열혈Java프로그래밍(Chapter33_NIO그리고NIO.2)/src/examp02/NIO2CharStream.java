package examp02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2CharStream {

	public static void main(String[] args) {
		String ks = "공부ㅜ에 있어서...";
		String es = "Life is long if .. . ";
		Path fp = Paths.get("String.txt");
		//쓰기
		try(BufferedWriter bw = Files.newBufferedWriter(fp)){ //(BufferedWriter bw = Files.newBufferedWriter(fp))스트림이 한번에 만들어짐
			bw.write(ks, 0, ks.length());
			bw.newLine();
			bw.write(es, 0, es.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//읽기
		try(BufferedReader br = Files.newBufferedReader(fp)){ //BufferedReader br = Files.newBufferedReader(fp) 굉장히 편해짐
			String str;
			while(true) {
				str = br.readLine();
				if(str ==null)
					break;
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
