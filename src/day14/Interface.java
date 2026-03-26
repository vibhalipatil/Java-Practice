package day14;

interface A{
	int age = 20;
	
	public void show();
	public void config();
}
class B implements A{
	public void show() {
		System.out.println("In show..");
	}
	public void config() {
		System.out.println("In config..");
	}
}
public class Interface {

	public static void main(String[] args) {
		A a = new B();
		a.show();
		a.config();
		System.out.println(a.age);
	}

}
