import java.util.Arrays;
import java.util.Collections;

public class inbuiltfn{
    public static void insertioSort(Integer arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev = i-1;
            // finding out the correct pos of insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
       // bubblesort(arr);
       // selectionsort(arr);
       // insertioSort(arr);
       // Arrays.sort(arr);
       // Arrays.sort(arr, 0, 3);  // for limited sorting
       Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}