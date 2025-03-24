import java.util.*;
// public class reverse{
//     public static void main(String args[]){
//         int n = 7836;
//         while(n>0){
//             int lastDigit = n%10;
//             System.out.print(lastDigit);
//             n = n/10;
//         }
//     }
// }

public class reverse{
    public static void main(String args[]){
        int n=8766;
        int rev = 0;
        while(n>0){
            int lastDigit=n%10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}