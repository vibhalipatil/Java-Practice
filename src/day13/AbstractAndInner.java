package day13;
abstract class A{
	public abstract void show();
}
public class AbstractAndInner {

	public static void main(String[] args) {
		
		A a = new A()
		{
			public  void show() {
				System.out.println("In Show of A..");
			}
		};
		a.show();

	}

}
