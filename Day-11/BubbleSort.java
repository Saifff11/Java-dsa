public class BubbleSort{
    public static void bubblesort(int arr[]){
        for(int turns=0; turns<arr.length-1; turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                // swap
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        
    }

    public static void insertioSort(int arr[]){
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
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
       // bubblesort(arr);
       // selectionsort(arr);
       insertioSort(arr);
        printArr(arr);
    }
}