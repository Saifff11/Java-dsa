// Ternery Operator
import java.util.*;
public class ternaryOp{
    public static void main(String[] args){
        //String type = (4%2==0)?"even":"odd";
        Scanner sc = new Scanner(System.in);
        int ageStatus = sc.nextInt();
       String Status = (ageStatus>18) ? "adult" : "not adult";
        System.out.println(Status);
    }
}