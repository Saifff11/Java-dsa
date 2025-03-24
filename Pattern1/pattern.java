import java.util.*;
public class pattern{
    public static void main(String args[]){
    //     for(int i=1;i<=5;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }

    // for(int i=5;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }

    //  for(int i=1;i<=5;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println("");
    //     }

    // print Character pattern
    char ch = 'A';
    int n = 6;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" "+ch);
            ch++;
        }
        System.out.println("");
    }
    }     
         
}