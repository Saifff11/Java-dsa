import java.util.*;
public class refrence{
    public static void update(int marks[], int nonchangeble){
        nonchangeble=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97, 89, 78};
        int nonchangeble=5;
        update(marks, nonchangeble);
        System.out.println(nonchangeble);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println("");
    }
}