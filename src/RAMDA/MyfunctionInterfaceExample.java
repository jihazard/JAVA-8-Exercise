package RAMDA;

import org.omg.Messaging.SyncScopeHelper;

public class MyfunctionInterfaceExample {
			public static void main(String[] args) {
				
				MyFunctionInterFace fi ; 
				
				fi = () -> {
					String str = "method call1";
					System.out.println(str);
				};
				fi.method();
				
				fi = () -> {
					System.out.println("method call2");
				};
				fi.method();
				
				fi = () -> System.out.println("method call3 ");
				fi.method();
				
				
				
				
				
				MyfunctionInterfaceExample2  fi2 ; 
				
				fi2 = (x) -> {
					int result = x * 5;
					System.out.println(result);
				};
				fi2.method(5);
				
				fi2 = (x) -> {System.out.println(x*5);};
				fi2.method(2);
				
				fi2 = x -> System.out.println(x*5);
				fi2.method(10);
				
				
				
				MyfunctionInterfaceReturnValue  fi3 ;
				
				fi3 = (x,y) -> {
					int result = x * y;
					
					
				};
				
				
				
			
				
				
				
				
			}
			
}
