class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s1=strs[0];
        for(int i=1;i<strs.length;i++){
            String temp=strs[i];
            while(!temp.startsWith(s1)){
                s1=s1.substring(0,s1.length()-1);
            }
        }
        return s1;
    }
}