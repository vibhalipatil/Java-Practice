package day8;

public class Logindata {
	// Creating Static Variable (shared across all tests)
    static String appURL = "https://testapp.com";

    // Encapsulation
    private String username;
    private String password;

    // Constructor using 'this'
    Logindata(String username, String password) {
        this.username = username;
        this.password = password;
    }

//    // Getter
//    public String getUsername() {
//        return username;
//    }

    // Polymorphism (Overloading)
    public void login(String username, String password) {
        System.out.println("Login with username & password: " + username);
    }

    public void login(String mobileNumber) {
        System.out.println("Login with mobile: " + mobileNumber);
    }

    // Use Static method to perform operations on static data
    public static void launchApp() {
        System.out.println("Launching: " + appURL);
    }
}
