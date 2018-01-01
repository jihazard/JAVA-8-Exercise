package RAMDA_MethodReferceExample;

import java.util.function.IntBinaryOperator;

public class MethodReferceExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//정적
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("결과 1 " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("결과 2" + operator.applyAsInt(5, 6));
		
		//인스턴스 메서드 참조
		
		Calculator obj = new Calculator();
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("결과 " + operator.applyAsInt(5, 6));
		
		operator = obj :: instanceMethod;
		System.out.println("결과 4" + operator.applyAsInt(7, 8));
		
	}
}
