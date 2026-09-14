class Solution {
    public String reverseWords(String s) {
        String j="";
        s=s.strip();
        String[] sb=s.split("\\s+");
        for(int i=sb.length-1;i>=0;i--){
            j+=sb[i];
            if(i!=0){
                j+=" ";
            }
        }
        return j;
    }
}