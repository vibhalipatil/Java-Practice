package day16;

class A{
	public void show() {
		for (int i = 1; i <= 10; i++) {
		    System.out.println("Hi.");
		}
	}
}
class B{
	public void show() {
		for (int i = 1; i <= 10; i++) {
            System.out.println("Hlello.");
		}
	}
}
public class Threads {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.show();
		obj2.show();

	}

}
