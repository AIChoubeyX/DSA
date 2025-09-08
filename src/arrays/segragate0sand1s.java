package src.arrays;

public class segragate0sand1s {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 0, 0, 1, 0, 1 };
        // int zero = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 0) {
        //         zero++;
        //     }
        // }
        // for (int i = 0; i < zero; i++) {
        //     arr[i] = 0;

        // }
        // for (int i = zero; i < arr.length; i++) {
        //     arr[i] = 1;

        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");

        // }
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
