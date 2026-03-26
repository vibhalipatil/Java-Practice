package day14;

class Computer{
	public void code(){
		
	}
}
class Laptop extends Computer{
	public void code() {
		System.out.println("Coding...");
	}
}
class Desktop extends Computer{
	public void code() {
		System.out.println("Coding...");
	}
}
class developer {
	public void DevApp(Computer Lap) {
		Lap.code();
	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		Computer Lap = new Laptop();
		Computer desk = new Desktop();
		 developer Y = new developer();
		 Y.DevApp(Lap);
		 
		 

	}

}
