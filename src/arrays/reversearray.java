// two pointer approach
package src.arrays;

public class reversearray {
    public static void main(String[] args) {
        int arr[] = {3,5,6,3,8,9,4,2,6};
        int n = arr.length;
        // int i = 0 , j = n - 1;
        // while(i < j){
        //     // swap arr[i] and arr[j]
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        // for middele elements only
        int i = 2 , j = 5;
        while(i < j){
            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k = 0; k < n; k++){
            System.out.print(arr[k] + " ");
        }
    }
    
}
