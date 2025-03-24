public class typecasting{
    public static void main(String args[]){
        double d = 75.5;
       // int x = d;    lossy coversion
       int x = (int)d;
       System.out.println(x);
    }
}