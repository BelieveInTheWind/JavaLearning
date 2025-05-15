package part1;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        String first = scanner.nextLine();
        int firstNum = Integer.valueOf(first);
        System.out.println("Give the second number: ");
        String second = scanner.nextLine();
        int secondNum = Integer.valueOf(second);
        int sum = firstNum + secondNum;
        System.out.println("The sum of the numbers is " + sum );
    }
}