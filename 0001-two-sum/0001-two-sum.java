class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(true){
            if(s==e){
                s++;
                e=nums.length-1;
            }
            if(nums[s]+nums[e]==target){
                break;
            }
            else{
                e--;
            }
        }
        return new int[] {s,e};
    }
}