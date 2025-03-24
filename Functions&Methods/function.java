import java.util.*;
public class function{
    public static int printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello mitians");
        return 3;
    }
    public static int calculateSum(int a, int b){   // parameter or formal parameter
        int sum = a + b;
        System.out.println("sum is : "+sum);
        return sum;
    }
    public static void main(String[] args) {
        //printHelloWorld();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);    // arguments or actual arguments
    }
}