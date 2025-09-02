package src.arrays;

import java.util.Arrays;

public class shallowcopydeepcopy {
    public static void main(String[] args) {
        //int a = 4;// 4 byte
        int[] arr = {1,2,3,4,5};// 20 byte...contiguous memory location
        int [] x = arr; //shallow copy
        x[0] = 99;
        System.out.println(arr[0]); //99

        int[] y = Arrays.copyOf(arr, arr.length); //deep copy
        y[0] = 100;
        System.out.println(arr[0]); //99
        
    }
}
