class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> al=new HashSet<>();
        for(int i:nums){
            if(al.contains(i)){
                return i;
            }
            else{
                al.add(i);
            }
        }
        return -1;
    }
}