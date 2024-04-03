package Controller;

import java.util.ArrayList;

public class DataFilter {

    public static void run(String userInput, ArrayList<Integer> perfectSquareNumbers, ArrayList<Integer> oddNumbers,
                           ArrayList<Integer> evenNumbers, ArrayList<Integer> allNumbers, ArrayList<String> upperChars,
                           ArrayList<String> lowerChars, ArrayList<String> specialChars, ArrayList<String> allChars) {
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            allChars.add(String.valueOf(currentChar));
            if (Character.isLetter(currentChar)) {
                if (Character.isUpperCase(currentChar)) {
                    upperChars.add(String.valueOf(currentChar));
                } else {
                    lowerChars.add(String.valueOf(currentChar));
                }
            } else if (Character.isDigit(currentChar)) {
                int currentNumber = Character.getNumericValue(currentChar);
                allNumbers.add(currentNumber);
                double squareRoot = Math.sqrt(currentNumber);
                if (squareRoot == Math.floor(squareRoot)) {
                    perfectSquareNumbers.add(currentNumber);
                }
                if (currentNumber % 2 == 0) {
                    oddNumbers.add(currentNumber);
                }
                if (currentNumber % 2 != 0){
                    evenNumbers.add(currentNumber);
                }
            } else {
                specialChars.add(String.valueOf(currentChar));
            }
        }
    }
}
