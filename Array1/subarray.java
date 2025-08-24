public class subarray {
    public static void printsubarray(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int SubArrSum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print("  " + numbers[k]);
                    SubArrSum += numbers[k];

                    ts++;
                }
                System.out.print(" (Subarray sum is : " + SubArrSum + ")");
                if (SubArrSum > maxSum) {
                    maxSum = SubArrSum;
                }

                if (SubArrSum < minSum) {
                    minSum = SubArrSum;
                }
                System.out.println("");

            }
            System.out.println("");
        }
        System.out.println("Max Subarray sum is : " + maxSum);
        System.out.println("Min Subarray sum is : " + minSum);
        System.out.println("total subarrays is " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 1, 3 };
        printsubarray(numbers);
    }
}