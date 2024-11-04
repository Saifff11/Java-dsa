import java.util.*;
// public class continueStatement{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             if(i==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// disply all numbesr entered by user expext multiples of 10
public class continueStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.print("enter a number : ");
            int n = sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("number was :"+n);
        } while (true);
    }
}