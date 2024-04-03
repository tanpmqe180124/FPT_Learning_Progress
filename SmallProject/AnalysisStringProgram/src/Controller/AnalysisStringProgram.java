package Controller;
import View.InputView;

import java.util.ArrayList;
import java.util.Scanner;

public class AnalysisStringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> perfectSquareNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> allNumbers = new ArrayList<>();
        ArrayList<String> upperChars = new ArrayList<>();
        ArrayList<String> lowerChars = new ArrayList<>();
        ArrayList<String> specialChars = new ArrayList<>();
        ArrayList<String> allChars = new ArrayList<>();

        String userInput;

        InputView.RequestDataInputString();
        userInput = sc.nextLine();
        DataFilter.run(userInput, perfectSquareNumbers, oddNumbers, evenNumbers, allNumbers,
                upperChars, lowerChars, specialChars, allChars);
        System.out.println("-----Result analysis---------");
        System.out.println("Perfect square numbers: [ ");
        for (int perfectSquareNumber : perfectSquareNumbers) {
            System.out.printf(perfectSquareNumber + ", ");
        }
        System.out.print("]\n");
        System.out.println("Odd numbers: [ ");
        for (int oddNumber : oddNumbers) {
            System.out.printf(oddNumber + ", ");
        }
        System.out.print("]\n");
        System.out.println("Even numbers: [ ");
        for (int evenNumber : evenNumbers) {
            System.out.printf(evenNumber + ", ");
        }
        System.out.print("]\n");
        System.out.println("All numbers: [ ");
        for (int allNumber : allNumbers) {
            System.out.printf(allNumber + ", ");
        }
        System.out.print("]\n");
        System.out.println("Uppercase Character: [ ");
        for (var upperChar : upperChars) {
            System.out.printf(upperChar + ", ");
        }
        System.out.print("]\n");
        System.out.println("Lowercase Character: [ ");
        for (var lowerChar : lowerChars) {
            System.out.printf(lowerChar + ", ");
        }
        System.out.print("]\n");
        System.out.println("Special Character: [ ");
        for (var specialChar : specialChars) {
            System.out.printf(specialChar + ", ");
        }
        System.out.print("]\n");
        System.out.println("All Character: [ ");
        for (var allChar : allChars) {
            System.out.printf(allChar + ", ");
        }
        System.out.print("]\n");
    }
}
