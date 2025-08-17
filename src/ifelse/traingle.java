package src.ifelse;
import java.util.Scanner;

public class traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lengths of the three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The lengths " + a + ", " + b + ", and " + c + " can form a triangle.");
        } else {
            System.out.println("The lengths " + a + ", " + b + ", and " + c + " cannot form a triangle.");
        }
        sc.close();
    }
}
