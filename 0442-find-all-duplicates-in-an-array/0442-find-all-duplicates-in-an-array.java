class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        Set<Integer> a=new HashSet<>();
        for(int i:nums){
            if(a.contains(i)){
                al.add(i);
                continue;
            }
            a.add(i);
        }
        return al;
    }
}