class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return sub(nums);
    }
    public List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i:arr){
            int n=outer.size();
            for(int j=0;j<n;j++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(i);
                outer.add(inner);
            }
        }
        return outer;
    }
}