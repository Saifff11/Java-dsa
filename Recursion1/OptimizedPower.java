public class OptimizedPower {
    public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        // int halfPowersq = optimizedPower(x, n/2) * optimizedPower(x, n/2);  // O(n)
        int halfPower = optimizedPower(x, n/2); // O(log n)
        int halfPowersq = halfPower * halfPower;

        // n is odd
        if(n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }

        return halfPowersq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimizedPower(x, n));
    }
    class Ride {
        private 
    }
}