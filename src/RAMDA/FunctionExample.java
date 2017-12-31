package RAMDA;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(
			new Student("윤지환", 10,20),
			new Student("김득현", 20,30)
			);
	
	public static void printString(Function<Student, String> function){
		for (Student student : list) {
			System.out.println(function.apply(student)+ " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function){
		for (Student student : list) {
			System.out.println(function.applyAsInt(student)+" s");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		System.out.println("학 생 이 름");
		printString( t -> t.getName());
		System.out.println("영어 점수");
		printInt( t -> t.getMathScore());
		System.out.println("수학 점수");
		printInt( t -> t.getEnglisheScore());
	}
}
