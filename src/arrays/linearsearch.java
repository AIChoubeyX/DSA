// package src.arrays;

// public class linearsearch {
//     static int linear(int[] arr, int target){
//         if(arr.length == 0){
//             return -1;
//         }
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5,6,7,8,9};
//         int target = 5;
//         System.out.println(linear(arr,target));
//     }
// }

package src.arrays;

public class linearsearch {
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}