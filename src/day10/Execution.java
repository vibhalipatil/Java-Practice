package day10;

public class Execution {

	public static void main(String[] args) {
		 // Parent reference, child object (Runtime Polymorphism)
        BasePage page = new LoginPage();

        page.launchBrowser(); // from BasePage
        page.click("Home Button"); // overridden method

        System.out.println("----- Login Flow -----");

        // Child reference to access child-specific method
        LoginPage loginPage = new LoginPage();
        loginPage.login("testUser", "12345");

	}

}
