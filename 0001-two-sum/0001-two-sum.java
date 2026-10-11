class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<nums.length){
            if(s==e){
                s++;
                e=nums.length-1;
                continue;
            }
            if(nums[s]+nums[e]==target){
                return new int[] {s,e};
            }
            else{
                e--;
            }
        }
        return new int[] {-1,-1};
    }
}