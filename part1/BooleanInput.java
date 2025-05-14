package part1;

import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        String quote = scanner.nextLine();
        boolean trueFalse = Boolean.valueOf(quote);
        System.out.println("True or false? " + trueFalse);
    }
}

