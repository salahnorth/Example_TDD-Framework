/* Name: Salah Mohamed
   Date: 23/02/04
   ID: 3044504
   Course: CMPT 395
   Assignment: TDD-Framework
   Program: FizzBuzz program
 */

import java.lang.String;

public class FizzBuzz{
    public String convert(int convertToString){
        String stringConvert = Integer.toString(convertToString);

        //If the integer is a multiple of 3 and 5, return FizzBuzz
        if (convertToString %3 == 0 && convertToString %5 == 0){
            return "FizzBuzz";
        }
        //If the integer is a multiple of only 3, return Fizz
        else if (convertToString %3 == 0){
            return "Fizz";
        }
        //If the integer is a multiple of only 5, return Buzz
        else if (convertToString %5 == 0){
           return "Buzz"; 
        }
        //Return to string format of the integer
        else{
            return stringConvert;
        }
    }
}
