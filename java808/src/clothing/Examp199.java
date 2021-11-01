package clothing;

public class Examp199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[][] = new String[2][2];
		s1[0][0]="red";
		s1[0][1]="blue";
		s1[1][0]="small";
		s1[1][1]="medium";
		
		for(String[]c:s1) {
			for(String s:c) {
				System.out.println(s+":");
			}
		}
//		for(int index=0;index<2;++index) {
//		for(int idx=0; idx<index;++idx) {
//			System.out.println(s1[index][idx]+":");
//		}
//	}
//		for(int index=0;index<=2;) {
//			for(int idx=0; idx<=2;) {
//				System.out.println(s1[index][idx]+":");
//				idx++;
//			}
//			index++;
//		}
//		int i = 10;
//		int j = 20;
//		int k = (j+=i)/5;
//		System.out.println(i+" "+k+" "+j);
//		for(int index=1)
		
	}

}
