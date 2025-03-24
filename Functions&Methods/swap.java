import java.util.*;
public class swap{
    public static int printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello mitians");
        return 3;
    }
    public static int swap(int a, int b){   // parameter or formal parameter
        //swap
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        return temp;
    }
    public static void main(String[] args) {
        // swap - values exchange
        int a = 5;
        int b = 8;
        int temp = swap(a,b);
       
    }
}