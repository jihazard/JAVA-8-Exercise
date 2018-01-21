package forEachAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilderExample {
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring","node","yoon");
		List<String> result = getFilterOutput(lines,"yoon");
		for (String string : result) {
			System.out.println("//"+string);
		}
		

		List<String> result2 = lines.stream()
				.filter(line-> !"yoon".equals(line))
				.collect(Collectors.toList());
		result2.forEach(System.out::println);
	}
	
	private static List<String> getFilterOutput(List<String> lines, String string) {
		List<String> result = new ArrayList<>();
		for (String line : result) {
			if(!"yoon".equals(line)){
				result.add(line);
			}
		}
		return result;
	}
	
	
						
}
