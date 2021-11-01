package clothing;

public class Examp39 {
	String s;
	public boolean equals(Examp39 str) {
		return this.s.equalsIgnoreCase(str.toString());
	}
	Examp39(String s){
		this.s=s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String s1 = "Moon";
		Examp39 s2 = new Examp39("Moon");
		
		if((s1=="Moon")&&(s2.equals("Moon"))) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		if(s1.equalsIgnoreCase(s2.s)) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		

	}

}
