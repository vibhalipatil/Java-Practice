package day9;

class Human1{
   String father;
	private int age = 24;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	public String getName() {
		return name;
	} 
	public void setName() {
		name= "Vibhali";
	}

}
public class encapsulation {

	public static void main(String[] args) {
		
		Human1 obj = new Human1();
		obj.setAge(19);
		obj.father= "Satish";
		obj.setName(); 
		System.out.println (obj.father);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
