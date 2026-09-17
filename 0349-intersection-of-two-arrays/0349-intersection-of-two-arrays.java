class Solution {
    public boolean search(int[] a,int t){
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                return true;
            }
        }
        return false;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(search(nums2,nums1[i])){
                if(!al.contains(nums1[i])){
                    al.add(nums1[i]);
                }
            }
        }
        int[] arr=new int[al.size()];
        int x=0;
        for(int k:al){
            arr[x]=k;
            x++;
        }
        return arr;
    }
}