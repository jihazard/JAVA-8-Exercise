package RAMDA;

public class UsingThisExample {
	public static void main(String[] args) {
		UsingThis using = new UsingThis();
		UsingThis.Inner inner = using.new Inner();
		
		inner.method();
	}
}
