import java.util.*;
public class fabonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(+b);
        for(int i=3; i<=n; i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
       // System.out.println("fabonacci series is :"+b);
    }
}









