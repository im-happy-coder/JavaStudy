package Question1_120;

public class Examp14 {
	static void doStuff()throws ArithmeticException, NumberFormatException, Exception{
		if (Math.random() > -1);
		throw new Exception ("Try again");
		}
	public static void main(String[] args)  {
			try {
			doStuff();
			} catch (ArithmeticException | NumberFormatException e) { 
				//catch (ArithmeticException | NumberFormatException e | Exception) {  //Exception을 지워줘야한다.
			System.out.println (e.getMessage()); }
			catch (Exception e) {
			System.out.println (e.getMessage()); }
			
		}

	}


////			답: C.
//Replace line 26 with:
//} catch (ArithmeticException | NumberFormatException e) {


