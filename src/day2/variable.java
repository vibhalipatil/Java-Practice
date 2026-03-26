package day2;

public class variable {

	public static void main(String[] args) {
		System.out.println(3+5);
		
		int num1 = 3;
		int num2 = 4;
		//string a= vibhali;
		//int result = num1 + num2;
		System.out.println(num1 + num2);
		//System.out.println("hello" a result);
		
		double a = 3.2;
		System.out.println(a);
		
		float c = 3.2f;
		System.out.println(c);
		
		boolean b = true;
		System.out.println(b);
		
		char n = 'a';
		n++;
		System.out.println(n);
		
		int A = 2;
		A++;
		System.out.println(A);
  
 // Type Casting :
		double x = 10.5;
		int y = (int) x;
		System.out.println(y);
 // Type conversion :
		int u = 20;
		double m = u;
		System.out.println(m);
		
		byte o = 10;
		byte p = 40;
		int s = o * p;
		System.out.println(s);
		
		int num4= 7;
		//num4 += 2; 
		int  result = num4++ ; // post increment    num4 --   //post decrement  It fetch the value of num4 first then increment or decrement it.  
		//int  result = ++ num4;  // pre increment    --num4    //pre decrement It increment or decrement the value of num4 then fetch it.
		//num4--;
		System.out.println(result);

	}

}
