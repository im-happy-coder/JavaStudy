package Question1_120;

//class DataConverter {{ //클래스가  implements AutoCloseable를 구현해한다.
	class DataConverter {
	public void copyflatFilesTotables() {}
	public void close() throws Exception{
		throw new RuntimeException(); //line n1
	}
}
public class Examp95 {

	public static void main(String[] args)throws Exception{
		try(DataConverter dc = new DataConverter()) //line n2 
		{ dc.copyflatFilesTotables();} 
	}

}

//A. A compilation error occurs at line n2.
// 답 : A. n2 행에서 컴파일 오류가 발생합니다.



//이건 AutoCloseable를 구현하고 있을때의 답이다.
//B. A compilation error occurs because the try block doesn't have a catch or finally block.
//B. try 블록에 catch 또는 finally 블록이 없기 때문에 컴파일 오류가 발생합니다.