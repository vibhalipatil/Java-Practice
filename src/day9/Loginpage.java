package day9;

public class Loginpage extends BaseClass {
	void testLogin() {
		launchBrowser();
		
		System.out.println("Enter username");
		System.out.println("Enter pasword");
		
		screenshot();
		 closeBrowser();
		
	}
	

}
