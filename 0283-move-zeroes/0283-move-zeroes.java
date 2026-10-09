
import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int c=0;
        for (int i=0; i<nums.length;i++) {
            if (nums[i]!=0){
                st.push(nums[i]);
            } else {
                c++;
            }
        }
        int i=0;
        while(!st.isEmpty()){
            nums[i]=st.remove(0);
            i++;
        }
        while (c>0){
            nums[i]=0;
            i++;
            c--;
        }
    }
}