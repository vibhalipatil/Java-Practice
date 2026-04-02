package day9;

public class BaseClass {
	String bowser = "Chrome"; 
	
	void launchBrowser() {
		System.out.println("Browser launch succesfuly " + bowser);
	}
	void closeBrowser() {
		System.out.println("Browser close succesfuly " + bowser);
	}
	void screenshot() {
		System.out.println("Screenshot taken!");
	}

public static void main (String [] args) {
	Loginpage lp = new Loginpage();
	lp.testLogin();
	PaymentPage pp = new PaymentPage();
	pp.testpayment();
	
	}
}