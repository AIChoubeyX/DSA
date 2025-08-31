package src.arrays;

import java.util.Scanner;

public class maxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        } 
        System.out.println("the maximum element in the array is : " + max);
        sc.close();

    }

}
