import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums){
            al.add(i);
        }
        for(int i=0;i<al.size();i++){
            while (i + 1 < al.size() && 
                   al.get(i).equals(al.get(i + 1))) {

                al.remove(i + 1);
            }

        }
        for (int i = 0; i < al.size(); i++) {
            nums[i] = al.get(i);
        }
        return al.size();
    }   
}