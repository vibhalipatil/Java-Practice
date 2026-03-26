package day4;
import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		/*String x = "vibhali";
		String result = " ";
		for (int i= 6; i>=0;) {
			result = result + x.charAt(i);
			System.out.print(result);
		}*/
		
		 /*Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        String result = "";
	         for (int i = name.length()-1 ; i >=  0 ; i-- ) {
	        	 result =  result + name.charAt(i);
	         }
	         System.out.print(result); */
	        
		Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        String result = "";
	         for (int i = name.length()-1 ; i >=name.length()-1; i--) {
	        	 result =  result + name.charAt(i);
	         }
	         System.out.print(result); 
	}
	
}

