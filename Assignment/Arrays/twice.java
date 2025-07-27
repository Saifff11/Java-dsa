
import java.util.HashSet;

public class twice {
    public static boolean twiceNum(int nums[]) {
        // Using Brute force Approach   O(n2)
        int count[] = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count[i]++;
                }
            }
            
            if(count[i]>1) {
                return true;
            }

        }
        return false;
    }

    public static boolean containsDuplicate(int nums[]) {
        // Using Hashset Approach   O(n)
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums));
    }
}