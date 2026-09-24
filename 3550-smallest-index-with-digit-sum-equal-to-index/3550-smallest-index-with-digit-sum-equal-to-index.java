class Solution {
    public int sum(String s){
        int s1=0;
        for(int i=0;i<s.length();i++){
            int z=Integer.parseInt(String.valueOf(s.charAt(i)));
            s1+=z;
        }
        return s1;
    }
    public int smallestIndex(int[] nums) {
        for(int j=0;j<nums.length;j++){
            if(sum(String.valueOf(nums[j]))==j){
                return j;
            }
        }
        return -1;
    }
}