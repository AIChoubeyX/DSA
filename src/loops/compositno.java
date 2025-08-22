package src.loops;

import java.util.Scanner;

public class compositno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean flag = true;//composte
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = false;//prime
                break;

           }
            
        }
        if (n <= 1) {
            System.out.println(n + " is neither prime nor composite");
            
        }
        else if(flag == false) {
            System.out.println(n + " is a composite number");
        }
        else  {
            System.out.println(n + " is a prime number");
        }
        sc.close();
    }
}
