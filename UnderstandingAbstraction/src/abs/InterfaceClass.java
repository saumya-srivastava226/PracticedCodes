package abs;

public class InterfaceClass implements Test {
	public void display() {
		System.out.println("I was an abstract in interface. The inherited class defined me");
	}
	public static void main(String args[]) {
		
		InterfaceClass fc=new InterfaceClass();
		
		System.out.println(Test.n);
		fc.display();
		
	}

}
