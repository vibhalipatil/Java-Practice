package day7;

public class array {

	public static void main(String[] args) {
		int num[]= {1,2,3};
		 num[2]= 4;
		System.out.println(num[2]);
		
		int num1[]= new int[4];
		num1[0]= 5;
		num1[1]= 10;
		num1[2]= 53;
		num1[3]= 15;
		
		for (int i=0; i<=3; i++) {
		
			System.out.println(num1[i]);
		}
		
	}

}
