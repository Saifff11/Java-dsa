public class practice{
    public static void main(String[] args) {
        int n=5;
        int arr[] = new int[n];
        arr[0] = 7;
        arr[1] = 1;
        arr[2] = -9;
        arr[3] = 4;
        arr[4] = 10;

        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
            if(sum>mx){
                mx = sum;
            }
            else{
                sum = 0;
            }
        }
            System.out.println("maximum sum = "+mx);
    }
}