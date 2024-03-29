package RAMDA_FunctionAndThenCompseExample;

import java.util.function.Function;

import RAMDA_consumerAndThenExample.Address;
import RAMDA_consumerAndThenExample.Member;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (m) -> m.getCity();
		
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
				new Member("홍길동" ,"hong" ,  new Address("한국","서울"))
				);
	}
}
