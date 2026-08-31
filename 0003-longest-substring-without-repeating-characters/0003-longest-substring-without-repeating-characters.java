class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        ArrayList<String> al=new ArrayList<>();
        String s1="";
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String z=String.valueOf(c);
            if(s1.contains(z)){
                int w=s1.indexOf(z);
                al.add(s1);
                s1=s1.substring(w+1);
                s1+=z;
            }
            else{
                s1+=z;
            }
            if(i == s.length() - 1){
                al.add(s1);
            }
        }
        for(int i=0;i<al.size();i++){
            if(al.get(i).length()>max){
                max=al.get(i).length();
            }
        }
        return max;
    }
}