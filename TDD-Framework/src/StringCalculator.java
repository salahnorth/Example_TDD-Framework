public class StringCalculator {
    public int Add(String numbers){
        if (numbers.length() == 0){
            return 0;
        }
        else if (numbers.length() == 1){
            int intNumbers = Integer.parseInt(numbers);
            return intNumbers;
        }
        else if (numbers.length() == 2){
            int sum = 0;
            String[] stringNumbers = numbers.split("");

            for(int i = 0; i < numbers.length(); i++){
                sum += Integer.parseInt(stringNumbers[i]);
            }
            return sum;
        }
        return 0;
    }
}
