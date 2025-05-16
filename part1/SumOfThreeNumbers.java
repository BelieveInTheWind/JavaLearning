package part1;

import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        String first = scanner.nextLine();
        System.out.println("Give the second number: ");
        String second = scanner.nextLine();
        System.out.println("Give the third number: ");
        String third = scanner.nextLine();
        int firstInt = Integer.valueOf(first);
        int secondInt = Integer.valueOf(second);
        int thirdInt = Integer.valueOf(third);
        int sum = firstInt + secondInt + thirdInt;
        System.out.println("The sum of the numbers is " + sum);
    }
}
