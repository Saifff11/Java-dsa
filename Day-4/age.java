//conditional statements
import java.util.*;
public class age{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age : ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are not adult");
        }

    }
}