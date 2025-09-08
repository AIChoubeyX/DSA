// find the missing number in an array of n+1 elements from 1 to n..if n is 4 then array will have 5 elements
package src.arrays;

public class missingarray {
    static int findMissing(int arr[], int n) {
        int total = (n + 1) * (n + 2) / 2; // sum of first n+1 natural numbers
        int sum = 0;

        // basic for loop
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return total - sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};  
        int n = arr.length;  // array has n=4 elements, but numbers are from 1 to 5
        System.out.println("Missing number is: " + findMissing(arr, n));
    }
}

// sum of n natural numbers = n(n+1)/2
// then we will make the sum of array elements and subtract it from the total sum to get the missing number