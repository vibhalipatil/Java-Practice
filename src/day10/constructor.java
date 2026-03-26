package day10;
class Human{
	 String Name;
	 int age;
	
	public Human()
	{
		Name = "Vibhli";
		age = 23; 
	
	}
	// Parameterized Constructor
	public Human(String a, int b) { 
		Name=a;
		age=b;
	}
	
	public String getName(){
		return Name;
	}
	public int getAge() {
        return age;
    }
	
	public void result (int a, int b) 
	{
		System.out.println(a+b);
	}
}

public class constructor {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.result(10, 10);
		
		Human obj1 = new Human();
		System.out.println(obj.getName() + ": " + obj.getAge());
		System.out.println(obj1.getName() + ": " + obj1.getAge());
		
		// Passing value to Parameterized Constructor
		Human obj2 = new Human("Yugal" , 24);
		System.out.println(obj2.getName() + ": " + obj2.getAge());

	}

}
