
// for taking input in array
import java.util.*;

public class array {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three marks ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // marks[2]=100;
        marks[2] = marks[2] + 1;

        // percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("maths :" + marks[2]);
        System.out.println("percentage is  :" + percentage + "%");

        // for printing the length of the array
        System.out.print("length of array is :" + marks.length);
    }
}