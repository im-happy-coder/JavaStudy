package examp01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStream {

	public static void main(String[] args) {
//		InputStream in = new FileInputStream("data.dat"); //입력 스트림 생성
//		DataInputStream fin = new DataInputStream(in); //필터 스트림 생성 및 연결
//		DataInputStream 필터 스트림  : 기본 자료형 데이터(Double,Int 등) 데이터의 입력을 위한 필터 스트림  ( 바이트 단위, 자동으로 닫힘)
//		
//		OutputStream out = new FileOutputStream("data.dat"); //입력 스트림 생성
//		DataOutputStream fout = new DataOutputStream(out); //필터 스트림 생성 및 연결
//		DataInputStream 필터 스트림  : 기본 자료형 데이터(Double,Int 등) 데이터의 입력을 위한 필터 스트림 ( 바이트 단위, 자동으로 닫힘)
		
		
		try (DataOutputStream fout = new DataOutputStream(new FileOutputStream("data.dat"))) {
		fout.writeInt(370); //int형 데이터 저장
		fout.writeDouble(3.14); //Double형 데이터 저장
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
