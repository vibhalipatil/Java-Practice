package day11;

//class Calc{
//	public int add(int a, int b) {
//		return a+b;
//	}
//	public int sub(int a, int b) {
//		return a-b;
//	}
//}
class AdvCalc extends Calc{
	public int div(int a, int b) {
		return a/b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
}
public class inheritance {

	public static void main(String[] args) {
		AdvCalc obj = new AdvCalc();
		int addation = obj.add(10, 20);
		int substraction= obj.sub(20, 10);
		int multiplication = obj.mul(10, 20);
		int Division= obj.div(20, 10);

		System.out.println(addation + " ," + substraction + ","+ multiplication + "," + Division  );
	}

}
