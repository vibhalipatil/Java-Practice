package day13;
class X{
	public void show() {
		System.out.println("In A..");
	}
	
	static class B{
		public void config() {
			System.out.println("In B..");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		X a =new X();
		a.show();
		
		 X.B b = new X.B();  // Static nested class instance
	        b.config();

	}

}
