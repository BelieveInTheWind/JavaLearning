package part1;

import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first numnber:");
        String a = scan.nextLine();
        int aa = Integer.valueOf(a);
        System.out.println("Give the second number:");
        String b = scan.nextLine();
        int bb = Integer.valueOf(b);
        if (aa > bb){
            System.out.println("Greater number is: " + aa);
        } else if (bb > aa){
            System.out.println("Greater number is: " + bb);
        } else {
            System.out.println("The numbers are equal!");
        }
        
    }
}
