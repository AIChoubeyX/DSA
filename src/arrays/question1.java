// multiply odd indexed elements by 2 and even indexed elements add 10
package src.arrays;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter the length of array: "); 
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input array elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // process array
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {  // even index
                arr[i] = arr[i] + 10;
            } else {          // odd index
                arr[i] = arr[i] * 2;
            }
        }

        // output result
        System.out.println("Modified array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
