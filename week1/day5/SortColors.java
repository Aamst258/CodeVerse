package week1.day5;
// leetcode problem no  75 
public class SortColors {
    class Solution {
        public void sortColors(int[] nums) {
            // --1st approach using any sorting algo
            // -------- 2nd approach count the no of 0's , 1's and 2's
            // replace/overwrite the array with those many no of 0's , 1's and 2's
            // int count0 = 0 , count1 = 0 , count2 = 0 ;
            // for(int num : nums){
            // if( num == 0 ) count0++ ;
            // else if (num == 1) count1++ ;
            // else count2++ ;
            // }
            // int i = 0 ;
            // for(; i < count0 ; i++){
            // nums[i] = 0 ;
            // }
            // for(; i < count0+count1 ; i++) {
            // nums[i] = 1 ;
            // }
            // for(; i < count0+count1 +count2 ; i++){
            // nums[i] = 2 ;
            // }
            // 3rd approach Dutch National Algorithm
           //3rd approach  Dutch National  flag Algorithm ---  
        int  n  = nums.length  ; 
         int  low = 0 ,  mid  = 0 ,  high  =  n-1  ;
         while(mid  <=high){
            if(nums[mid] == 0){
                int temp   =  nums[mid] ; 
                nums[mid] =  nums[low] ; 
                nums[low] =   temp  ; 
                mid++ ; 
                low++ ;
            } else if  (nums[mid] == 1){
                mid++ ; 
            }  else { 
                int temp  =  nums[mid] ; 
                nums[mid] = nums[high] ; 
                nums[high] = temp ; 
                high-- ; 
            }
         }
        }
    }
}
