/* Name: Salah Mohamed
   Date: 23/02/04
   ID: 3044504
   Course: CMPT 395
   Assignment: TDD-Framework
   Program: Testing FizzBuzz program
 */

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    //Creating an object for FizzBuzz
    static FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
	public void fizzBuzzNumber(){
        //Testing the values that are not multiples of 3 or 5
		String expectedForNum1 = "1";
		String actualForNum1 = fizzBuzz.convert(1);
        String expectedForNum2 = "2";
        String actualForNum2 = fizzBuzz.convert(2);

		Assert.assertEquals(expectedForNum1, actualForNum1);
        Assert.assertEquals(expectedForNum2, actualForNum2);
	}
    @Test
    public void fizzBuzzMultipleOf3(){
        //Testing the values that are multiple of 3
        String expectedForMultOf3 = "Fizz";
        String actualForMultOf3 = fizzBuzz.convert(3);

        Assert.assertEquals(expectedForMultOf3, actualForMultOf3);
    }
    @Test
    public void fizzBuzzMultipleOf5(){
        //Testing the values that are multiple of 5
        String expectedForMultOf5 = "Buzz";
        String actualForMultOf5 = fizzBuzz.convert(5);

        Assert.assertEquals(expectedForMultOf5, actualForMultOf5);
    }
    @Test
    public void fizzBuzzMultipleOf3And5(){
        //Testing the values that are multiple of 3 and 5
        String expectedForMultOf3And5 = "FizzBuzz";
        String actualForMultOf3And5 = fizzBuzz.convert(15);

        Assert.assertEquals(expectedForMultOf3And5, actualForMultOf3And5);
    }
}
