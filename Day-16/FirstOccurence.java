public class FirstOccurence {
    public static int firstOccurence(int arr[], int key, int i) {
       if(arr[i] == arr.length) {
        return -1;
       }
       if(arr[i] == key) {
        return i; 
       }

       return firstOccurence(arr, key, i+1);  
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,7,8};
        int key = 5;
        System.out.println(firstOccurence(arr, key, 0));
    }
}