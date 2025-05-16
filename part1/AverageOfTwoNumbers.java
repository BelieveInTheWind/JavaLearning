package part1;

import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        String a = scanner.nextLine();
        int aa = Integer.valueOf(a);
        System.out.println("Give the second number:");
        String b = scanner.nextLine();
        int bb = Integer.valueOf(b);
        int sum = aa + bb;
        double average = (1.0 * sum) / 2.0;
        System.out.println("The average is " + average);
}
}
