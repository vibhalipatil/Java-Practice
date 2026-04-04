package day10;

public class LoginPage extends BasePage{
	 // Method Overriding
    public void click(String element) {
        super.click(element); // calling parent method
        System.out.println("Logging click action for reporting");
    }

    void login(String username, String password) {
        type("Username Field", username);
        type("Password Field", password);
        click("Login Button");
    }
}
