package day10;

public class BasePage implements WebActions {
	 final String browser = "Chrome"; // final variable

	    void launchBrowser() {
	        System.out.println("Launching browser: " + browser);
	    }
	    // Implementing interface methods
	    public void click(String element) {
	        System.out.println("Clicking on: " + element);
	    }
	    public void type(String element, String text) {
	        System.out.println("Typing '" + text + "' into: " + element);
	    }
}
