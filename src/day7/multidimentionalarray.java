package day7;

public class multidimentionalarray {

	public static void main(String[] args) {
		int num1[][]= new int [3][4];
		
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=3; j++) {
				System.out.print(num1 [i][j] + "");
			}
			System.out.println();
		}
		
		/*Random function
		for(int i=0;i<=100;i++) {
			 int num=(int)(Math.random()*100);
	           System.out.print(num + " ");
		}*/
          
	}

}
