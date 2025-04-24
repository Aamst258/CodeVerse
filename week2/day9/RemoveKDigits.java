package week2.day9;

import java.util.Stack;

// leetcode problem no  402. Remove K Digits  
public class RemoveKDigits {
     public String removeKdigits(String num, int k) {
         Stack<Character>  st  =  new Stack<>() ; 
         for(char digit  : num.toCharArray()){
            while(!st.isEmpty() &&  k > 0 && st.peek() > digit){
                st.pop() ; 
                k--;
            }  
            st.push(digit) ;   
         }  
        // remove remaining K digits from the end of the stack  
        while(k > 0 && !st.isEmpty()){
            st.pop() ; 
            k-- ; 
        }    
        // construct the resulting string   
        StringBuilder sb  =  new StringBuilder() ; 
        while(!st.isEmpty()){
            sb.append(st.pop()) ;
        } 
        sb.reverse(); 

        // removing leading zeros  
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0) ; 
        }  
        return sb.length() > 0 ? sb.toString() : "0" ; 
    }
}
