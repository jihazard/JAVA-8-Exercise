package RAMDA_consumerAndThenExample;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
		public static void main(String[] args) {
			Consumer<Member> consumerA =(m) ->{
				System.out.println("consumerA " + m.getName());
			};
		
			Consumer<Member> consumberB = (m) -> {
				System.out.println("consumerB " + m.getId());
			};
			
			Consumer<Member>  consumberAB = consumerA.andThen(consumberB);
			
			consumberAB.accept(new Member("윤지환" ,"윤",null));
		}
}
