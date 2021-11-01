package clothing;

public class Test49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sht[] [] = new String[2][2];
		sht[0][0] = "red";
		sht[0][1] = "blue";
		sht[1][0] = "small";
		sht[1][1] = "medium";
		
//		for(String[] c : sht) {
//			for(String s : c) {
//				System.out.println(s+":");
//			}
//		}
		for(int index=0; index<2;++index) {
			for(int idx=0; idx<index;++idx) {
				System.out.println(sht[index][idx]+":");
			}
		}
	}

}
