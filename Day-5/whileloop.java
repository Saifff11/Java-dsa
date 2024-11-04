import java.util.*;
// public class whileloop{
//     public static void main(String[] args){
//         int counter = 0;
//         while(counter < 10){
//             System.out.println("hello");
//             counter++;
//         }
//         System.out.println("printed hello world 100x times");
//     }
// }

        // print number from 1 to 100
        // public class whileloop{
        //     public static void main(String[] args) {
        //         int counter = 0;
        //         while(counter<10){
        //             counter++;
        //             System.out.println(counter);
        //         }
        //     }
        // }

        //print number 1 to n
        // public class whileloop{
        //     public static void main(String[] args) {
                
        //         Scanner sc = new Scanner(System.in);
        //         int counter = 1;
        //         int n = sc.nextInt();
        //         while(counter<=n){
        //             System.out.print(counter+" ");
        //             counter++;
        //         }
        //     }
        // }

        //sum of first natural number
        public class whileloop{
            public static void main(String args[]){
                int i = 1,sum = 0;
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                while(i<=n){
                    sum += i;
                    i++;
                }
                System.out.println("sum is "+sum);

            }
        }
