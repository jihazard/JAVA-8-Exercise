package RAMDA;

public class UsingLocalVariable {
		 void method(int arg) {
			// TODO Auto-generated method stub
			int localVar = 40;
			
			MyFunctionInterFace fi = () -> {
				System.out.println("Arg " + arg);
				System.out.println("local valr" + localVar);
			};
			
			fi.method();
		}
}
