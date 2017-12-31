package RAMDA;

public class UsingThis {
		public int outter = 10;
		
		class Inner {
			int inner = 20;
		
		
	     void method() {
			// TODO Auto-generated method stub
	    	 MyFunctionInterFace fi = () ->{
	    		 System.out.println("outterFIELD " + outter);

	    		 System.out.println("outterFIELD " + UsingThis.this.outter);
	    		 System.out.println("innerField " + inner);
	    		 System.out.println("innerField " + this.inner);
	    		 
	    	 };
		   }
		}
}
