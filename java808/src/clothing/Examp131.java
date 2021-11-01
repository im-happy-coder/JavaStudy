package clothing;

public class Examp131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3};
		int nums2[] = {1,2,3,4,5};
		nums2 = nums1;
		for(int x: nums2) {
			System.out.println(x+":");
		}
	}

}
