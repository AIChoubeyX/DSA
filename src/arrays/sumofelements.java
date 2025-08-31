package src.arrays;
import java.util.Scanner;

public class sumofelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            
        }
        System.out.println("the sum of elements in the array is : " + sum);
        sc.close();
    }

}
