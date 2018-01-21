package forEachAndMap;

import java.util.ArrayList;
import java.util.List;

public class forEachAndList {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		items.add("F");
		
		for (String string : items) {
			System.out.println(string);	
		}
		
		items.forEach(item->System.out.println(item));
		items.forEach((v)->System.out.println("value: " +v));
	
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
		
		items.forEach(System.out::println);
		items.stream()
			 .filter(s->s.contains("B"))
			 .forEach(System.out::println);
		
	}
}
