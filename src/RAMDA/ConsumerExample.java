package RAMDA;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		//객체 t를 받아 소비 한다. 
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		//객체 t와   u를 받아 소비
		BiConsumer<String, String> bigCoin = (t,u) -> System.out.println(t + u);
		bigCoin.accept("java" , "8");
		
		//DOUBLE 값을 받아 소비
		DoubleConsumer doubleConsumer = d->System.out.println("java " +d);
		doubleConsumer.accept(8.0);
		
		//객체 T와 DOUBLE 값을 받아 소비
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("JAVA", 8);
		
	}
}
