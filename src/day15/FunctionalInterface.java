package day15;


interface A{
	void show(int i);
}
/*class B implements A{
	public void show() {
		System.out.println("In show");
	}
}*/
public class FunctionalInterface {

	public static void main(String[] args) {
		 A b = i -> System.out.println("In show" + ":" +i);
		 b.show(5);
		 }
	}

/*A b = new A(){
 *  public void show(){
 *  	System.out.println("In show");
 *   }
 * };    
b.show();
} */
