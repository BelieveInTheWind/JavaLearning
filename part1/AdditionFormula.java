package part1;

import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        String first = scanner.nextLine();
        int firstInt = Integer.valueOf(first);
        System.out.println("Give the second number: ");
        String second = scanner.nextLine();
        int secondInt = Integer.valueOf(second);
        int sum = firstInt + secondInt;
        System.out.println(firstInt + " + " + secondInt + " = " + sum);
    }
}
