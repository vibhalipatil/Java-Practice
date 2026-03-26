package day9;

class mobile{
	String name;
	int prise;
	static int year;
	
	public void show () {
		System.out.println(name + " " + prise + " " + year);
	}
	 
	public static void show1(mobile obj1) {
		System.out.println( year + ":" + obj1.name );
	}
		
}
public class staticvariable {

	public static void main(String[] args) {
		mobile obj = new mobile();
		obj.name= "Apple";
		obj.prise = 125000;
		
		mobile obj1 = new mobile();
		obj1.name= "Samsung";
		obj1.prise = 145000;
		
		mobile.year= 2004;
		

        obj.show();
        obj1.show();
        mobile.show1(obj1);
	}

}
