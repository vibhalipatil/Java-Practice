package day7;

class testing{
	int num= 5;
	
	int add(int n1,int n2) {
		int r1= n1+n2;
		return r1;
	}
	
}
public class snh {

	public static void main(String[] args) {
		testing t = new testing();
		
         System.out.println(t.num);
        
         int num1=10;
         int num2=6;
         int result= t.add(num1, num2);
         System.out.print(result);
       
         
	}

}
