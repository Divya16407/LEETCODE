class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int t=0;
        for(int i=0;i<=nums.length;i++){
            s+=i;
        }
        for(int j=0;j<nums.length;j++){
            t+=nums[j];
        }
        return s-t;
    }
}