public class largest {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;    // - infinity
        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

            if(smallest >  numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 5, 88, 2, 10, 66 };
        System.out.println("Largest value is : "+getlargest(numbers));
    }
}