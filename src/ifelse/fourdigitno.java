package src.ifelse;
import java.util.Scanner;
public class fourdigitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num >= 1000 && num <= 9999) {
            System.out.println("The number " + num + " is a four-digit number.");
        } else {
            System.out.println("The number " + num + " is not a four-digit number.");
        }
        sc.close();
    }
}
