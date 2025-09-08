// rotate an array by k times...means take the first k elements and put them at the end of the array(left rotation)
package src.arrays;

public class rotatearray {
    public static void main(String[] args) {
        int arr[] = {3,5,6,3,8,9,4,2,6};
        int n = arr.length;
        int k = 3; // number of rotations
        k = k % n; // in case k is greater than n
        // step 1: reverse first k elements
        reverse(arr, 0, k - 1);
        // step 2: reverse remaining n-k elements
        reverse(arr, k, n - 1);
        // step 3: reverse the whole array
        reverse(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int arr[], int start, int end){
        while(start < end){
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
