import java.util.*;

// public class SwitchCase {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter a number");
//     int a = sc.nextInt();
//     System.out.println("enter b number");
//     int b = sc.nextInt();
//     System.out.println("enter operator : ");
//     char operator = sc.next().charAt(0);
//     switch (operator){
        // case 1: System.out.println("sunday");
        //             break;
        // case 2 : System.out.println("monday");
        //             break;
        // case 3: System.out.println("tuesday");
        //             break;
        // case 4: System.out.println("wednesday");
        //             break;
        // case 5: System.out.println("thursday");
        //             break;
        // case 6: System.out.println("friday");
        //             break;
        // case 7: System.out.println("saturday");
        //             break;
        // default : System.out.println("wrong input");

//         case '+': System.out.println("sum is : "+(a+b));
//                     break;
//         case '-': System.out.println("sub is : "+(a-b));
//                      break;
//         case '*': System.out.println("multiple is : "+(a*b));
//                      break;
//         case '/': System.out.println("divide is : "+(a/b));
//                      break;
//         default : System.out.println("wrong input");

//     }
//     }
// }

// weekday/weekend
public class SwitchCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1: //{}//System.out.println("weekday");  //monday
            //break;                                 
            case 2: //System.out.println("weekday");  //tuesday
            // break;  
            case 3: System.out.println("weekday");  //wednesday
            break;
            case 4: System.out.println("weekday");  //thursday
            break;
            case 5: //System.out.println("weekday");  //friday
            // break;
            case 6: //System.out.println("weekend");  //saturday
            // break;
            case 7: System.out.println("weekend");  //sunday
            break;
            default : System.out.println("weekend");
        }
    }
}