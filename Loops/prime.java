import java.util.*;
//public class prime{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean isprime = true;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 isprime = false;
//             }
        
//         if(isprime==true){
//             System.out.println("n is prime");
//             break;
//         }
//         else{
//             System.out.println("n is not prime");
//             break;
//         }
//         }
//     }
// }
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("not prime");
                break;
            }
            else{
                System.out.println("prime");
                break;
            }
            //else{
             //   System.out.println("neither be prime or neither be composite");
            //}
        }
    }
}