package part1;

import java.util.Scanner;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        String a = scanner.nextLine();
        int aa = Integer.valueOf(a);
        System.out.println("Give the second number:");
        String b = scanner.nextLine();
        int bb = Integer.valueOf(b);
        System.out.println("Give the third number:");
        String c = scanner.nextLine();
        int cc = Integer.valueOf(c);
        int sum = aa + bb + cc;
        double average = 1.0 * sum / 3.0;
        System.out.println("The average is " + average);
    }
}
