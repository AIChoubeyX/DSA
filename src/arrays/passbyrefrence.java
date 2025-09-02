package src.arrays;

public class passbyrefrence {
    public static void main(String[] args) {
        int x[] = { 1, 2, 3, 4, 5 };
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    static void change(int[] x) {
        x[2] = 99;
    }
}
// variables in java are passed by value
// but when we pass an array then the reference of the array is passed
// hence any change made to the array inside the method will be reflected outside the method
// this is known as pass by reference