package RAMDA;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("윤지환", 10,20),
			new Student("김득현", 20,30)
			);
	
	public static double avg(ToIntFunction<Student> function){
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);
			
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglisheScore());
		System.out.println("영어 평균 " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("수학 평균 " + mathAvg);
	}
	
}
