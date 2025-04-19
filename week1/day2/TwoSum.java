import java.util.HashMap;
// leetcode problem number  1 
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // brute force time complexity
        int[] res = new int[2];
        int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             res[0] = i;
        //             res[1] = j; 
        //             break ; 
        //         }
        //     }
        // }  
        //  2nd approach hashing   ---- 
         HashMap<Integer, Integer> map =  new HashMap<>() ; 
        for(int  i = 0 ; i < n ; i ++){
            if(map.containsKey(target-nums[i])){
                res[0] =  map.get(target-nums[i]) ; 
                 res[1]  =   i ; 
                 break  ; 
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 5 };
        int target = 9;
        int[] res = twoSum(arr, target);
        System.out.println(res + " ");
    }
}