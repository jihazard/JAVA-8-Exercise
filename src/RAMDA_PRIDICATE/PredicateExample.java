package RAMDA_PRIDICATE;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import RAMDA.Student;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("윤지환", "남" ,20),
			new Student("김득현", "여" ,30)
			);
	
	
	public static double avg(Predicate<Student> predicate){
		int count = 0 , sum = 0;
		for (Student student : list) {
			if(predicate.test(student)){
				count ++;
				sum += student.getEnglisheScore();
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남"));
		System.out.println("남자 평균 : " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여"));
		System.out.println("남자 평균 : " + femaleAvg);
	}
}
