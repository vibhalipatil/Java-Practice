package day4;

import java.util.Arrays;
import java.util.List;

public class Productsearch {

	public static void main(String[] args) {
		
		 List<String> producst = Arrays.asList("Laptop", "Mobile", "Tablet", "Headphones", "Camera");

	        String finalproduct = "Headphones";
	        boolean productfound = false;

	        for (String product : producst) {
	            if (product.equals(finalproduct)) {
	                productfound = true;
	                break;
	            }
	        }

	        if (productfound) {
	            System.out.println("Product Found ");
	        } else {
	            System.out.println("Product Not Found");
	        }
	   }
	}
