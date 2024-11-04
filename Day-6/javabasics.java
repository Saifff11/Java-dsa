import java.util.*;
public class javabasics{
    public static void main(String args[]){
        int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j>=n+1){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print(" ");
        //         }
        //        // System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(j-i>=n-5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //        // System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(j-i==0 || j+i==n+1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //         //System.out.print("* ");
        //     }
        //     System.out.println("");
        // }

        // for(int i=1;i<=n;i++){
        //      for(int j=1;j<=n;j++){
        //          if(i+j>=6 || i+j>=8 || i+j>=10){
        //              System.out.print("*");
        //          }else{
        //              System.out.print(" ");
        //          }
        //         // System.out.print("* ");
        //      }
        //      System.out.println("");
        //  }

        for(int i=1;i<=n;i++){
             for(int j=1;j<=n;j++){
                 if(i>=j){
                     System.out.print(" "+i);
                 }else{
                     System.out.print(" ");
                 }
                // System.out.print("* ");
             }
             System.out.println("");
         }
    }
}