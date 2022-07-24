package packagetwo;
import packageone.*;
public class Two {
	
	private void look() {
		System.out.println("I am private");
	}
	protected void display() {
		System.out.println("Hello, I am protected");
	}
	
	public static void main(String args[]) {
		One o=new One();
		o.show();
		System.out.println(o.attribute);
	}
}
