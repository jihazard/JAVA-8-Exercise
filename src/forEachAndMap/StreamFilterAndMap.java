package forEachAndMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilterAndMap {
	public static void main(String[] args) {
		   List<Person> persons = Arrays.asList(
	                new Person("yoon", 30),
	                new Person("jack", 20),
	                new Person("lawrence", 40)
	        );
		   
		   String name = persons.stream()
				   .filter(x-> "jack".equals(x.getName()))
				   .map(Person::getName)
				   .findAny()
				   .orElse("");
		   
		   System.out.println("name " + name);
		   
		   
		 List<Integer> collect = persons.stream()
				 .map(Person::getAge)
				 .collect(Collectors.toList());
		 
		 collect.forEach(System.out::println);
	}
}
