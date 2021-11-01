package clothing;

public class Examp107 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String[] arr = {"A", "B", "C", "D"};
		for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
				if(arr[i].equals("D")) {
					System.out.println("work done");
					break;
				}
				continue;
			}
	}

}
