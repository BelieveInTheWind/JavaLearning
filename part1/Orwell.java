package part1;

import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        String a = scanner.nextLine();
        int aa = Integer.valueOf(a);
        if (aa == 1984){
            System.out.println("Orwell");
        }
    }
}

