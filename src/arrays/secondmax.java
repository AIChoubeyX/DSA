package src.arrays;

public class secondmax {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15,2,2,2};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondmax && arr[i]!=max){
                secondmax = arr[i];
            }
        }
        System.out.println("The second maximum element in the array is: " + secondmax);
    }
}
