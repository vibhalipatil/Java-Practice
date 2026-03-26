package day13;

abstract class Car{
	public abstract void Drive();
	public abstract void Flying();
	public void Music() {
		System.out.println("Paly music");
	}
}
abstract class Punch extends Car{

	public void Drive() {
		System.out.println("Driving...");
	}
}
class Nexon extends Punch{
	public void Flying() {
		System.out.println("Flying...");
	}
}
public class AbstrctClass {

	public static void main(String[] args) {
		
		Car c = new Nexon();
		c.Drive();
		c.Music();
		c.Flying();

	}

}
