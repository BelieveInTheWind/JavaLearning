package part1;

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String string = scanner.nextLine();
        System.out.println("Give an integer: ");
        String integerInput = scanner.nextLine();
        int integerOutput = Integer.valueOf(integerInput);
        System.out.println("Give a double: ");
        String doubleInput = scanner.nextLine();
        double doubleOutput = Double.valueOf(doubleInput);
        System.out.println("Give a boolean: ");
        String booleanInput = scanner.nextLine();
        boolean booleanOutput = Boolean.valueOf(booleanInput);
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integerOutput);
        System.out.println("You gave the double " + doubleOutput);
        System.out.println("You gave the boolean " + booleanOutput);
    }
}
