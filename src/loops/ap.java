package src.loops;
import java.util.Scanner;

public class ap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term (n): ");
        int n = sc.nextInt();
        // for(int i= 2; i <= 3*n-1; i += 3) {
        //     System.out.println("Term: " + i);
        // }
        int a  = 2 , d = 3;
        for(int i = 1; i <= n; i++) {
            System.out.println("Term " + i + ": " + a);
            a += d;
    }
        sc.close();
}
}