package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Base class
class TestBase {
	void log(String message) {
		System.out.println("LOG: " + message);
	    }
	}
	// Child class
class LoginTest extends TestBase {
	void executeTest() {
		System.out.println("Executing Login Test");
	 }

public static void main(String[] args) {
	TestBase test = new LoginTest();
	test.log("Test started");

	        // 🔹 Downcasting
	        LoginTest login = (LoginTest) test;
	        login.executeTest();

	        // 🔹 ArrayList (store test cases)
	        List<String> testCases = new ArrayList<>();
	        testCases.add("Login Test");
	        testCases.add("Signup Test");
	        testCases.add("Login Test");

	        System.out.println("Test Cases: " + testCases);

	        // 🔹 HashSet (remove duplicates)
	        Set<String> uniqueTests = new HashSet<>(testCases);
	        System.out.println("Unique Tests: " + uniqueTests);

	        // 🔹 HashMap (test results)
	        Map<String, String> results = new HashMap<>();
	        results.put("Login Test", "Pass");
	        results.put("Signup Test", "Fail");

	        System.out.println("Results: " + results);
	}

}
