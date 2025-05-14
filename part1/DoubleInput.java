package part1;

import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        String dou = scanner.nextLine();
        double doubleValue = Double.valueOf(dou);
        System.out.println("You gave the number " + doubleValue);

    }
}
