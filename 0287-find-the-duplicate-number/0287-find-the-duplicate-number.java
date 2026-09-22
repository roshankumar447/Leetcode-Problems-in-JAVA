class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
        if(nums[i]==nums[i+1]){
            return nums[i];
        }
        i++;}
        return 0;
    }
}