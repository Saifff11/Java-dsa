import java.util.*;
// public class maxSubarraysum{
//     public static void maxsubarraysum(int numbers[]){
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//                 int end = j;
//                 currsum=0;
//                 for(int k=start;k<=end;k++){
//                     // subarray sum
//                     currsum += numbers[k];
//                 }
//                 System.out.println(currsum);
//                 if(maxsum<currsum){
//                     maxsum=currsum;
//                 }
//             }
//         }
//         System.out.println("max sum ="+maxsum);
        
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1,-2,6,-1,3};
//         maxsubarraysum(numbers);
//     }
// }


// prefix array method of max subarray sum
public class maxSubarraysum{
    public static void maxsubarray(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0]=numbers[0];
        // calculate array sum
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end = j;

                currsum = start == 0? prefix[end];
            }
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxsubarray(numbers);
    }
}