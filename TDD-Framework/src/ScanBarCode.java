/* Name: Salah Mohamed
   Date: 23/02/05
   ID: 3044504
   Course: CMPT 395
   Assignment: TDD-Framework
   Program: Scan barcode program
 */

import java.util.HashMap;
import java.util.Map;

public class ScanBarCode {
    private Map<String, Double> productPrice;

    public ScanBarCode() {
        //Creating a new hashmap and adding the specified examples
        productPrice = new HashMap<>();
        productPrice.put("12345", 7.25);
        productPrice.put("23456", 12.50);
    }

    public String scan(String barcode) {
        //Scanning the barcode if it's empty, non existent or displaying the price
        if (barcode == null || barcode.length() == 0) {
            return "Error: empty barcode";
        }
        if (!productPrice.containsKey(barcode)) {
            return "Error: barcode not found";
        }
        return "$" + String.format("%.2f", productPrice.get(barcode));
    }

    public String getTotal() {
        //Calculating the total cost of all products purchased.
        double total = 0.0;
        for (double price : productPrice.values()) {
            total += price;
        }
        return "$" + total;
    }
}
