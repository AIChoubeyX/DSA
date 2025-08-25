package src.function;
import java.util.Scanner;

public class permutationandcombination {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        
        int ncr = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("nCr is: " + ncr);
        int npr = factorial(n)/factorial(n-r);
        System.out.println("nPr is: " + npr);
        sc.close();

    }
}
