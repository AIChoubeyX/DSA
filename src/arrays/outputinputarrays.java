package src.arrays;
import java.util.Scanner;

public class outputinputarrays {
    public static void main(String[] args) {
        // int [] x = {1,2,3,4,5,6,76,78};
        // for(int i=0;i<x.length;i++){
        //     System.out.println(x[i]);
        // }
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array : "); 
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        // output
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
