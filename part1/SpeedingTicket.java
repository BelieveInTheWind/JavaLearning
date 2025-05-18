package part1;

import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed:");
        String s = scanner.nextLine();
        int speed = Integer.valueOf(s);
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}