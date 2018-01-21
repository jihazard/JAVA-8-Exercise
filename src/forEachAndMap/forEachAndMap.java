package forEachAndMap;

import java.util.HashMap;
import java.util.Map;

public class forEachAndMap {
	public static void main(String[] args) {
		
		Map<String, Integer> items= new HashMap<>();
		items.put("A",10);
		items.put("B",20);
		items.put("C",30);
		items.put("D",40);
		items.put("E",50);
		items.put("F",60);
		items.put("G",70);
		items.put("H",80);
		items.put("I",90);
		items.put("J",100);
		//entry는 키와 벨류를 모두 가져온다.
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("item :" + entry.getKey() +"// count : " + entry.getValue());
		}
		//keyset 은  key값만 가져온다.
		for (String entry : items.keySet()) {
			System.out.println("item :" + entry +"// count : " + entry);
		}
		
		//Ramda
		items.forEach((k,v)->System.out.println("item: "+ k +"count"+ v));
		
		items.forEach((k,v)->{
			System.out.println("item " + k +"count" + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		}
				);
		
	}
}
