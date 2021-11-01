package clothing;

public class Test64 {
	static double area;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,b,h;
		if(area==0) {
			b=3;
			h=4;
			p=0.5;
			area = p*b*h;  // line n2 여기에 있으면 가능
		} 
//		area = p*b*h; 이게 여기있으면 컴파일 실패 //line n2
		System.out.println("Area is "+ area);
	}

}
