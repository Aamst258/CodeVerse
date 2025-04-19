import java.util.HashSet;
import java.util.Set;
// leetcode problem number  128 
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        // nlogn approach
        int n = nums.length;
        if (n == 0)
            return 0;
        // 1st approach using sorting
        // Arrays.sort(nums) ;
        // int maxCount = Integer.MIN_VALUE ;
        // int count =1 ;
        // for(int i = 1; i < nums.length ; i++){
        // if(nums[i-1]+1 == nums[i]) count++ ;
        // else if ( nums[i-1] == nums[i]) continue ;
        // else {
        // maxCount = Math.max(count, maxCount) ;
        // count = 1 ;
        // }
        // }
        // maxCount = Math.max(count,maxCount) ;
        // return maxCount ;
        // ------2nd approach using set and a fact that if number just smaller than the
        // // element does not exists in the array then it is start of consecutive
        // sequence
        // so for every element we will apply this to find the longest consecutive
        // sequence
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        // remove duplicates
        int longest = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                // if there no just smaller number in array then it is
                // start of consecutive sequence
                int count = 1;
                while (set.contains(num + count))
                    count++;
                longest = Math.max(longest, count);
                if (longest > n / 2)
                    return longest;
            }
        }
        return longest;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 1, 3, 4, 0, 1, -2 };
        int ans = longestConsecutive(arr);
        System.out.println(ans);
    }
}
