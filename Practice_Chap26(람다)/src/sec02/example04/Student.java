package sec02.example04;

public class Student {
	private String name;
	private int engscore;
	private int matscore;
	
	
	public Student(String name, int engscore, int matscore) {
		super();
		this.name = name;
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

	

	
	
}
