public class Fibonacci {
    public static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int fibNm1 = fib(n-1);
        int fibNm2 = fib(n-2);
        int fibN = fibNm1 + fibNm2;
        return fibN;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n)); // for at the term 
    }
}