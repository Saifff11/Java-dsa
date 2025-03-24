import java.util.*;
public class Largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // System.out.println("enter two numbers : ");
        System.out.println("enter a number");
         int a = sc.nextInt();
         System.out.println("enter b number : ");
         int b = sc.nextInt();
        // if(a>b){
        //     System.out.println("a is largest numbar : "+a);
        // }
        // else{
        //     System.out.println("b is largest number : "+b);
        // }

        //three largest number
        System.out.println("enter c number : ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is largest number ");
            }
            else{
                System.out.println("c is largest number ");
            }
        }
        else{
            if(b>c){
                System.out.println("b is largest number");
            }
            else{
                System.out.println("c ic largest number");
            }
        }

    }
}