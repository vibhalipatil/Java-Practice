package day11;

public class Application {
	    public static void main(String[] args) {

	        UserService service = new UserService();
	        try {
	            service.processUser("Vibhali", "25");     // valid input
	            service.processUser("TestUser", "abc");   // invalid input

	        } catch (Exception e) {
	            System.out.println("Unexpected error: " + e.getMessage());
	        } finally {
	            System.out.println("Application execution completed");
	        }
	    }
	}
	// Base Class (Access Modifier Example)
	class BaseService {

	    protected void log(String message) {
	        System.out.println("[LOG]: " + message);
	    }
	}
	// Model Class (Encapsulation + Wrapper Class)
	class User {
	    private String name;
	    private Integer age;  // Wrapper Class

	    public User(String name, Integer age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public Integer getAge() {
	        return age;
	    }
	}
	// Utility Class (Data Conversion + Exception Handling)
	class DataUtils {
	    // String → Integer conversion
	    public static Integer convertToInt(String value) {
	        try {
	            return Integer.parseInt(value); // Wrapper class usage
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number format: " + value);
	            return 0;
	        }
	    }

	    // Division with exception handling
	    public static int divide(int a, int b) {

	        try {
	            return a / b;
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero");
	            return 0;
	        } finally {
	            System.out.println("Division attempted");
	        }
	    }
	}

	// Service Class (Business Logic + Inheritance)
	class UserService extends BaseService {

	    public void processUser(String name, String ageInput) {

	        log("Processing user data...");

	        // Data Conversion
	        Integer age = DataUtils.convertToInt(ageInput);

	        // Create User Object
	        User user = new User(name, age);

	        // Business Logic
	        if (user.getAge() > 18) {
	            log(user.getName() + " is an adult");
	        } else {
	            log(user.getName() + " is a minor");
	        }
	        // Exception Handling Example
	        int result = DataUtils.divide(10, 0);
	        log("Division Result: " + result);
	    }
	}

