// SHAURYA CHAWLA //
// 10/24/19 //
// PROJECT-2 (ROMAN NUMERALS) // (2nd FILE) //

import java.util.Scanner;

public class RomanDriver {
    // This method is called from the main method and is used to ask the user how many numbers to convert
    public static void runProgram(Scanner sc) {
        System.out.print("How many numbers do you have to convert? ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            getNextNumber(sc);
        }
    }

    // This method is called from runProgram
    public static void getNextNumber(Scanner sc) {
        System.out.print("Please enter the number that you would like to convert: ");
        int num = sc.nextInt();
        if (num > 0) {
            String romanNumeral = RomanHelper.getRoman(num);
            System.out.println(num + " as a Roman Numeral is " + romanNumeral);
        } else if (num == 0) {
            System.out.println("Sorry, " + num + " is neither positive nor negative and cannot be converted.");
        } else {
            System.out.println("Sorry, " + num + " is not a positive number and cannot be converted.");
        }
    }

    // The main method
    public static void main(String[] args) {
        RomanHelper.description();
        Scanner sc = new Scanner(System.in);
        runProgram(sc);
    }
}
