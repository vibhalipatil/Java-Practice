package day11;

class A{
	public A(){
		System.out.println("Default of a");
	}
	public A(int n) {
		super();
		System.out.println(n + "paramitarized of A");
	}
}
class B extends A{
	public B() {
		super( 20);
		System.out.println("Default of b");
	}
	public B(int n) {
		this();
		System.out.println(n + "paramitarized of B");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		
		B obj = new B(10);


	}

}
