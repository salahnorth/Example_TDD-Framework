/* Name: Salah Mohamed
   Date: 23/02/04
   ID: 3044504
   Course: CMPT 395
   Assignment: TDD-Framework
   Program: Testing FizzBuzz program
 */

import org.junit.*;

public class FizzBuzzTest {
    //Creating an object for FizzBuzz
    static FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
	public void fizzBuzzNumber(){
        //Testing the values that are not multiples of 3 or 5
		Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
	}

    @Test
    public void fizzBuzzMultipleOf3(){
        //Testing the values that are multiple of 3
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzMultipleOf5(){
        //Testing the values that are multiple of 5
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void fizzBuzzMultipleOf3And5(){
        //Testing the values that are multiple of 3 and 5
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
    
}
