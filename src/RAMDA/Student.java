package RAMDA;

public class Student {
	private String name;
	private int englisheScore;
	private int mathScore;
	
	public Student(String name , int eng , int math) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.englisheScore = eng;
		this.mathScore = math;
		
	}

	public String getName() {
		return name;
	}

	public int getEnglisheScore() {
		return englisheScore;
	}

	public int getMathScore() {
		return mathScore;
	}
	
	
}
