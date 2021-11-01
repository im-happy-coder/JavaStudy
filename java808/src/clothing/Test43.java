package clothing;

public class Test43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[2];
		strs[0]="bb";
		strs[1]="aa";
		int idx=0;
		for(String s : strs) {
			strs[idx].concat(" element"+idx);
			idx++;
		}
		for(idx=0; idx<strs.length; idx++) {
			System.out.println(strs[idx]);
		}

	}

}
