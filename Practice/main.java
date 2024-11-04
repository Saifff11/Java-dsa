//     public static void main(String[] args) {
//         int arr[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter physics marks");
//         arr[0] = sc.nextInt();
//         System.out.println("enter chemistry marks");
//         arr[1] = sc.nextInt();
//         System.out.println("enter math marks");
//         arr[2] = sc.nextInt();
//         System.out.println("enter English marks");
//         arr[3] = sc.nextInt();
//         System.out.println("enter urdu marks");
//         arr[4] = sc.nextInt();

//         int totalSum = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
//         int average = ((arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5);

//         System.out.println("total marks = "+totalSum);
//         System.out.println("total percentage = "+average);
//     }
// }

// linear search
public class main{
    public static int linearsearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    // binary search
    public static int binarysearch(int numbers[], int key){
        int start = 0;  int end = numbers.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,9,12,14,16,13};
        int key = 12;
        // int index = linearsearch(numbers, key);
        // if(index == -1){
        //     System.err.println("NOT FOUND");
        // }
        // else{
        //     System.out.println("key is at index : "+index);
        // }
        int index = binarysearch(numbers, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index : "+index);
        }
    }
}