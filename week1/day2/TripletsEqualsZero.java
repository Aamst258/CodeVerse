import java.util.*;
// leetcode  problem number  15 
public class TripletsEqualsZero {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // triplesEqualsToZero
        // sort the input
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int key2 = nums[j];
                int key3 = nums[k];
                int val = nums[i] + nums[j] + nums[k];
                if (val == 0) {
                    List<Integer> subAns = new ArrayList<>();
                    subAns.add(nums[i]);
                    subAns.add(nums[j]);
                    subAns.add(nums[k]);
                    ans.add(subAns);
                    while (key2 == nums[j] && j < k)
                        j++;
                    while (key3 == nums[k] && j < k)
                        k--;

                } else if (val > 0) {
                    while (key3 == nums[k] && j < k) {
                        k--;
                    }
                } else {
                    while (key2 == nums[j] && j < k)
                        j++;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -2, -2, -1, -1, -1, 0, 0, 0, 1, 1, 1, 2, 2, 2 };
        List<List<Integer>> ans = threeSum(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
            // prints arraylist that sum up to zero
        }
    }
}
