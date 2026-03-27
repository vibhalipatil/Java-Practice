package day3;

public class LoginValidator {

	public static void main(String[] args) {
		 String username = "testUser";
	     String password = "Test@123";
	     int loginAttempts = 2;

	        // Applying Conditions
	        boolean isUsernameValid = username != null && !username.isEmpty();
	        boolean isPasswordValid = password.length() >= 8;
	        boolean isAttemptsAllowed = loginAttempts < 3;

	        // Final Expression using Logical Operators
	        boolean canLogin = isUsernameValid && isPasswordValid && isAttemptsAllowed;

	        // Decision Making using if-else
	        if (canLogin) {
	            System.out.println("Login Successful ✅");
	        } else {
	            System.out.println("Login Failed ❌");

	            if (!isUsernameValid) {
	                System.out.println("Reason: Invalid Username");
	            }
	            if (!isPasswordValid) {
	                System.out.println("Reason: Weak Password");
	            }
	            if (!isAttemptsAllowed) {
	                System.out.println("Reason: Max login attempts exceeded");
	            }
	        }

	        // Increment attempt
	        loginAttempts++;
	        System.out.println("Updated Attempts: " + loginAttempts);
	    }
	}
