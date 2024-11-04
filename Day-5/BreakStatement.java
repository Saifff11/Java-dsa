import java.util.*;
// public class BreakStatement{
//     public static void main(String args[]){
//         for(int i=1; i<5; i++){
//             if (i==3){
//                 break;
//             }
//         }
//         System.out.println("i am out of the loop");
//     }
// }

// keep entering numbers till users enter a multiple of 10
public class BreakStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("enter your number : ");
            int n = sc.nextInt();

            if(n%10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}