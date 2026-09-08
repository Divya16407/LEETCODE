class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                hs.add(nums[i]);
            }
        }

        int a=1;

        while(hs.contains(a)){
            a++;
        }

        return a;
    }
}