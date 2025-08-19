package src.ifelse;
import java.util.Scanner;
// given point x and y write a program to check whether the point lies in the first quadrant or 2nd quadrant or 3rd quadrant or 4th quadrant or on x axis or y axis or at origin
public class xy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter the y coordinate: ");
        double y = sc.nextDouble();
        sc.close();

        if( x>0 && y>0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the first quadrant.");
        } 
        else if (x<0 && y>0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the second quadrant.");
        }
        else if(x<0 && y<0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the third quadrant.");
        }
        else if (x>0 && y<0) {
            System.out.println("The point (" + x + ", " + y + ") lies in the fourth quadrant.");
        }
        else if (x == 0 && y != 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the y-axis.");
        } 
        else if (y == 0 && x != 0) {
            System.out.println("The point (" + x + ", " + y + ") lies on the x-axis.");
        }
        else {
            System.out.println("The point (" + x + ", " + y + ") is at the origin.");
        }



    }
}
