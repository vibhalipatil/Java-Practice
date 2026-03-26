package day15;

public class Exceptionhandling {

	public static void main(String[] args) {
		int i = 0 ;
		int j = 0;
		try {
			j = 18/i;
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Can not divided by 0");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong  :"  +e);
		}
		
		System.out.println(j);
		System.out.print("Bye");

	}

}
