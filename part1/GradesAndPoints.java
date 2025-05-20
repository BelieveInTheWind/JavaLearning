package part1;

import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        String a = scan.nextLine();
        int aa = Integer.valueOf(a);
        if (aa < 0) {
            System.out.println("impossible!");
        } else if (aa >= 0 && aa <= 49) {
            System.out.println("failed");
        } else if (aa >= 50 && aa <= 59) {
            System.out.println("1");
        } else if (aa >= 60 && aa <= 69) {
            System.out.println("2");
        } else if (aa >= 70 && aa <= 79) {
            System.out.println("3");
        } else if (aa >= 80 && aa <= 89) {
            System.out.println("4");
        } else if (aa >= 90 && aa <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible");
        }
    }
}


