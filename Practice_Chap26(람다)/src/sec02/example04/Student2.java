package sec02.example04;

public class Student2 {
	private String name;
	private String address;
	private int engscore;
	private int matscore;
	
	
	public Student2(String name,String address, int engscore, int matscore) {
		super();
		this.name = name;
		this.address=address;
		this.engscore = engscore;
		this.matscore = matscore;
	}
	
	public String getName() {
		return name;
	}

	public int getEngscore() {
		return engscore;
	}

	public int getMatscore() {
		return matscore;
	}

	public String getaddress() {
		return address;
	}


	
	
}
