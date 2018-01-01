package RAMDA_OPERATOR;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
		private static int[] score = {92,95,87};
		
		public static int maxOrMin(IntBinaryOperator operator){
			int result = score[0];
			for (int i : score) {
				result = operator.applyAsInt(result, i);
				}
			return result;
		}
		
		
		public static void main(String[] args) {
			
			int max = maxOrMin(
					(a,b)->{
						if(a>=b) return a;
						else return b;
					}
			);
			
			System.out.println("최대값  " + max);
			
			int min = maxOrMin((a,b)->{if(a<=b)return a;
			else return b;
				}
			);
			System.out.println("최소값 " + min);		
		}
}
