package day6;

public class Stringexample {

	public static void main(String[] args) {

		        String productDetails = "Product: Laptop | Price: 50000 | Discount: 10%";
		        String[] details = productDetails.split("\\|"); // Spliting the string

		        String productName = details[0].split(":")[1].trim();
		        String priceStr = details[1].split(":")[1].trim();
		        String discountStr = details[2].split(":")[1].trim().replace("%", "");

		        // Convert to numbers
		        int price = Integer.parseInt(priceStr);
		        int discount = Integer.parseInt(discountStr);

		        // Calculate final price
		        int finalPrice = price - (price * discount / 100);

		        System.out.println("Product Name: " + productName);
		        System.out.println("Original Price: " + price);
		        System.out.println("Discount: " + discount + "%");
		        System.out.println("Final Price: " + finalPrice);

		        // Validation
		        if (finalPrice < price) {
		            System.out.println("Price calculation is correct");
		        } else {
		            System.out.println("Price calculation is incorrect");
		        }
		    }
	}
