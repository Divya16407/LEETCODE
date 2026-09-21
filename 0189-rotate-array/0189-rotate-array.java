class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        k=k%nums.length;
        int[] arr=new int[nums.length];
        int x=nums.length-k;
        for(int i=1;i<=k;i++){
            arr[i-1]=nums[x];
            x++;
        }
        for(int j=0;j<nums.length-k;j++){
            arr[j+k]=nums[j];
        }
        for(int z=0;z<nums.length;z++){
            nums[z]=arr[z];
        }
    }
}