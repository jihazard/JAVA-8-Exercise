package forEachAndMap;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyElse {
	public static void main(String[] args) {
		
		
		List<Person> persons = Arrays.asList(
				new Person("yoon" ,30),
				new Person("jack" , 20),
				new Person("tom" , 40)
				);
		Person result = getStudentByName(persons,"yoon");
		System.out.println(result);
		
		Person reuslt1 = persons.stream()
				.filter(x->"jack".equals(x.getName()))
				.findAny()
				.orElse(null);
		
		System.out.println(reuslt1);
		
		Person result2 = persons.stream()
				.filter(x->"tom22".equals(x.getName()))
				.findAny()
				.orElse(null);
		System.out.println(result2);
		
		Person result3 = persons.stream()
				.filter((p)->"jack".equals(p.getName()) && 20 == p.getAge())
				.findAny()
				.orElse(null);
		
		System.out.println("result3 " + result3);
		
		Person result4 = persons.stream()
				.filter(p->{
					if("jack".equals(p.getName()) && 20 == p.getAge()){
						return true;
					}
					return false;
				}).findAny()
				.orElse(null);
		System.out.println("result4" + result4);
	}

	private static Person getStudentByName(List<Person> persons, String string) {
		Person result = null;
		for (Person person : persons) {
			System.out.println("person" +  person);
			if(string.equals(person.getName())){
				System.out.println("findperson" +  person);
				result = person;
				
			}
		}
		return result;
	}
}
