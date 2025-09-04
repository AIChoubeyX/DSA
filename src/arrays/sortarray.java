package src.arrays;

import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int [] arr = {9,2,4,1,6,7,8};
        print(arr);
        //sort the array
        Arrays.sort(arr);
        print(arr);
    }
    public static void print (int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
