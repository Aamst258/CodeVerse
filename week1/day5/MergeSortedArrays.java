package week1.day5;
// leetcode problem no 88 
public class MergeSortedArrays {
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        // start filling from the last      
        int  i =   m -1  ; 
        int  j   = n -1  ; 
        int  k   =   m + n -1  ; 
        while(i>= 0 && j >=0 ){
          if(nums1[i] > nums2[j]) nums1[k--] = nums1[i--];  
          else nums1[k--] = nums2[j--];
        }  
  
        while(j>=0){
          nums1[k--] =  nums2[j--] ; 
        }
      }
}
