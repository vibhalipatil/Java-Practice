package day3;

public class statments {

	public static void main(String[] args) {
		/*int a = 6;
		int b = 7;
		int c = 8;
		 if(a>b && a>c) {
			System.out.println("a");
		}
		else if(b>c) {
		 System.out.println("b");
		}
		else
			System.out.println("C is grester");	
		int result = a%1 == b? 1: 0;  //Ternary Operator
		 System.out.println(result);*/
		
		// Switch Statment:
		String day = "Sunday";
		String result = " ";
		
		result = switch (day) {
		case "Sunday" , "Saturday" ->  "9am";
		case "Monday" ->  "6am";
		default  ->  "7am";
		};
		System.out.println(result);
	}

}
