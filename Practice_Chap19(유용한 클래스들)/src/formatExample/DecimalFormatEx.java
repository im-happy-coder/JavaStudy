package formatExample;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		double number = 5577669.78;
		
		//0은 자릿수를 다 차지하고 0을 다 표시함, #은 표현은 다 하되 #표식이 안된다.
		DecimalFormat dFormat = new DecimalFormat("0");  
		System.out.println(dFormat.format(number));

		dFormat = new DecimalFormat("0.0");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("00000000000.00000");
		System.out.println(dFormat.format(number));
		
		
		
		dFormat = new DecimalFormat("#");  
		System.out.println(dFormat.format(number));
		
		
		dFormat = new DecimalFormat("#.#");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("########.#####");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#,###.00");
		System.out.println(dFormat.format(number));
		
	}

}
