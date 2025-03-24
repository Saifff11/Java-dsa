public class IncreasingRec {
    public static void printInc(int n) {
        if(n == 10) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printInc(n+1);
    }
    // 2nd method
    public static void printIncr(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        printIncr(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        // int n = 1;
        // printInc(n);
        int n = 10;
        printIncr(n);
    }
}