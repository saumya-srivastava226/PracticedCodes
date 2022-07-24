package abs;
// The below class is abstract. It can have abstract as well as non abstract method
abstract class Vehicle{
	abstract void show();// This is an abstract method
	
	void display() {
		System.out.println("I am non abstract method inside the abstract class");
	}
}
class Car extends Vehicle{
	public void show() {
		System.out.println("I was an abstract method. The class that extended me defined me.");
	}
}
public class ClassAbstract {
	public static void main(String args[]) {
			Car c=new Car();
			c.show();
			c.display();
	}
}
