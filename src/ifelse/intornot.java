package src.ifelse;
import java.util.Scanner;

public class intornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble(); //n = 3.5
        int x = (int) num; // Explicit typecasting from double to int// n = 3
        if (num == x) {
            System.out.println("The number " + num + " is an integer.");
        } else {
            System.out.println("The number " + num + " is not an integer.");
        }
        sc.close();

    }
}
