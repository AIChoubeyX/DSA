package src.basics;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter radius of circle : ");
        // double r = sc.nextInt();
        // double area = 3.14 * r * r;
        // System.out.println("Area of circle: " + area);
        System.out.print("Enetr first number : ");
        double a = sc.nextDouble();
        System.out.print("Enetr second number : ");
        double b = sc.nextDouble();
        double sum = a * b;
        System.out.println("Sum of two numbers: " + sum);
        sc.close();
    }

}
//  double x = 5.0/2.0 -> 2.5 -> int/int = int/double
//  ek bhi double hua to answer will be double ---> 5/2 = 2    5.0/2 = 2.5   5/2.0 = 2.5  5.0/2.0 = 2.5