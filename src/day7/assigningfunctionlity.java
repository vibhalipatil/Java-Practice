package day7;

public class assigningfunctionlity {
	String username = "Vibhali";
	String password = "qwertyuy";
	String button = "submit";
	
	assigningfunctionlity(){
		System.out.println("Web page open by creating Constructor");
	}
	
	void enterusername(String username) {
		System.out.println("Ussername is:" + username);
	}
	void enterpassword (String password) {
		System.out.println("Password is:" + password);
	}
	void clickbutton() {
		System.out.println("Button got clicked" + button);
	}
	void login ()  {
		enterusername(username);
		enterpassword(password);
		clickbutton();
	}
}
