package day5;

public class Arraysexample {

	public static void main(String[] args) {
		 // Product prices in cart
        int[] prices = {1200, 499, 2999, 150, 700};
        int total = 0;
        int maxPrice = prices[0];
        boolean productFound = false;
        int searchPrice = 499;
        
        // Loop through array 
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
            
            if(prices[i]>maxPrice) {
            	maxPrice = prices[i];
            }
            if(prices[i] == searchPrice) {
            	productFound = true;
            }
       }

        // Output results
        System.out.println("Total Cart Value: ₹" + total);
        System.out.println("Highest Price Product: ₹" + maxPrice);

        if (productFound) {
            System.out.println("Product with price ₹" + searchPrice + " found in cart");
        } else {
            System.out.println("Product not found");
        }
    }
}
