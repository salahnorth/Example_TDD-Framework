/* Name: Salah Mohamed
   Date: 23/02/04
   ID: 3044504
   Course: CMPT 395
   Assignment: TDD-Framework
   Program: Testing ScanBarCode program
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestScanBarCode {
    private ScanBarCode barcodeScan = new ScanBarCode();

    @Test
    public void testScanForBarcode12345() {
        //Testing the barcode scan for 12345
        assertEquals("$7.25", barcodeScan.scan("12345"));
    }
    @Test
    public void testScanForBarcode23456() {
        //Testing the barcode scan for 23456
        assertEquals("$12.50", barcodeScan.scan("23456"));
    }
    @Test
    public void testScanForNonExistentBarcode() {
        //Testing the barcode scan for non existent barcode
        assertEquals("Error: barcode not found", barcodeScan.scan("99999"));
    }
    @Test
    public void testScanForEmptyBarcode() {
        //Testing the barcode scan for empty barcode
        assertEquals("Error: empty barcode", barcodeScan.scan(""));
    }

    @Test
    public void testTotal() {
        //Testing the total price of the products
        assertEquals("$19.75", barcodeScan.getTotal());
    }
}
