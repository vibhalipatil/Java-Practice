package day3;

public class LoginValidator {

	public static void main(String[] args) {
		 String username = "testUser";
	     String password = "Test@123";
	     int loginAttempts = 2;

	        // Conditions
	        boolean isUsernameValid = username != null && !username.isEmpty();
	        boolean isPasswordValid = password.length() >= 8;
	        boolean isAttemptsAllowed = loginAttempts < 3;

	        // Final Expression using Logical Operators
	        boolean canLogin = isUsernameValid && isPasswordValid && isAttemptsAllowed;

	        // Output
	        System.out.println("Username Valid: " + isUsernameValid);
	        System.out.println("Password Valid: " + isPasswordValid);
	        System.out.println("Attempts Allowed: " + isAttemptsAllowed);
	        System.out.println("User Can Login: " + canLogin);

	        // Increment attempt
	        loginAttempts++;
	        System.out.println("Updated Attempts: " + loginAttempts);
	    }


	}
