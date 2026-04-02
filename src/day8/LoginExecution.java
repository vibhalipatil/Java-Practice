package day8;

public class LoginExecution {

	public static void main(String[] args) {
		Logindata.launchApp(); // “Calling a static method to internally uses the static variable.
		System.out.println(Logindata.appURL); //“Calling a static variable directly.
		
		Logindata lg = new Logindata("Vibhali" , "Vib19");
		lg.login("Vibhali" , "Vib19");
		lg.login("6735535567");
		
//		System.out.println(lg.getUsername());
	}

}
