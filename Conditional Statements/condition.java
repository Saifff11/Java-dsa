import java.util.*;
// public class condition{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int num = sc.nextInt();
//         if(num >= 0){
//             System.out.println("positive");
//         }
//         else{
//             System.out.println("negative");
//         }

//     }
// } 

// leap year program
// import java.util.*;
// public class condition{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a year");
//         int year = sc.nextInt();
//         if(year%4==0){
//             if(year%100==0){
//                 if(year%400==0){
//                     System.out.println("this is leap year");
//                 }
//                 else{
//                     System.out.println("this is not leap year");
//                 }
//             }
//             else{
//                 System.out.println("this is leap year");
//             }
//         }
//         else{
//             System.out.println("this is not leap year");
//         }
//     }
// }

// fizz buzz problem
// public class condition{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter anumber :");
//         int n = sc.nextInt();

//         if(n%3==0 && n%5==0){
//             System.out.println("fizz buzz");
//         }
//         else if(n%3==0){
//             System.out.println("fizz");
//         }
//         else if(n%5==0){
//             System.out.println("buzz");
//         }
//         // if(n%3==0 && n%5==0){
//         //     System.out.println("fizz buzz");
//         // }
//         else {
//             System.out.println("no itself");
//         }
//     }
// }

// time zone converter GMT TO IST 5:30
public class condition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minutes = sc.nextInt();

        minutes += 30;
        hour += 5;

        if(minutes>60){
            hour++;
            minutes -= 60;
        }
        else if(hour>24){
            day++;
            hour -= 24;
        }

        System.out.println("day :"+day+",hours :"+hour+",minutes :"+minutes);
    }
}