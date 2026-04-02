package day7;

public class assigningfunctionlity {
	String username = "Vibhali";
	String password = "qwertyuy";
	String button = "submit";
	
	assigningfunctionlity(){
		System.out.println("Weg page open by creating conct");
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
