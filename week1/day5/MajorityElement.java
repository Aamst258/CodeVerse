package week1.day5;

import java.util.HashMap;
import java.util.*;

// leetcode problem number 169 
public class MajorityElement {

    public int majorityElement(int[] nums) {

        int n = nums.length;
        if (n == 1)
            return nums[0];
        // --------1st approach brute force
        // for(int i = 0 ; i < n ; i++){
        // int count = 1 ;
        // for(int j = 0 ; j < n ; j++){
        // if(i != j && nums[i] == nums[j]){
        // count++ ;
        // if(count > n/2) return nums[i] ;
        // }
        // }
        // }
        // returning zero to avoid error
        // ----------------2nd approach using hashmap to store element and it's count
        // and iterate in the map
        // to find the majority element
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums)
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // Iterator hmIterator = map.entrySet().iterator();
        // int maxCount = Integer.MIN_VALUE;
        // int element = 0;
        // while (hmIterator.hasNext()) {
        // Map.Entry mapElement = (Map.Entry) hmIterator.next();
        // int count = (int) mapElement.getValue();
        // if (count > maxCount) {
        // maxCount = count;
        // element = (int) mapElement.getKey();
        // }
        // }
        // return element;
        // -- 3rd approach moore's voting algorithm
        // moore's voting algorithm
        int element = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (element == num) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == element)
                count++;
        }
        return (count > n / 2 ? element : -1);

    }
}
