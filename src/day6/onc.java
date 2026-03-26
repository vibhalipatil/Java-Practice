package day6;

class calculator {
	
	public int add(int n1,int n2) {
		int r = n1+n2;
		return r;
	}
	public void sub(int n1,int n2) {
		int r = n1 - n2;
		System.out.println(r);
	}
}
class getting extends calculator{
	int num1=19;
	int num2=4;
	
	calculator cal = new calculator();
	int result6 = cal.add(num1, num2);
	//System.out.println(result6);
}
public class onc {

	public static void main(String[] args) {
		int num1=10;
		int num2=4;
		calculator cal = new calculator();
		int result= cal.add(num1, num2);
		System.out.println(result);
		
		/*calculator cal2=new calculator();
		int result2= cal2.sub(num1, num2);
		System.out.println(result2);
		
		getting get = new getting();*/
		
		cal.sub(num1, num2);
		

	}

}

