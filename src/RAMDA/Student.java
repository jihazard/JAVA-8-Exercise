package RAMDA;

public class Student {
	private String name;
	private int englisheScore;
	private int mathScore;
	private String sex;
	
	public Student(String name , int eng , int math) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.englisheScore = eng;
		this.mathScore = math;
		
	}
	public Student(String name , String sex ,int eng) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.englisheScore = eng;
		this.sex = sex;
		
	}
	public String getSex() {
		return sex;
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
