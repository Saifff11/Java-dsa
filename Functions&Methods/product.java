public class product{
    public static int multiply(int a, int b){
        //int product = a*b;
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        int a = 5;
        int b = 6;
        int prod = multiply(a,b);
        System.out.println("multiply is : "+prod);
        prod = multiply(10,20);
        System.out.println("multiply is :"+prod);
        int add = multiply(32,10);
        System.out.println("sum is : "+add);
    }
}