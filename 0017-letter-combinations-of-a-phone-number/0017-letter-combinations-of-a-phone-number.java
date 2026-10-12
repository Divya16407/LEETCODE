class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> al=new ArrayList<>();
        if(digits.length()==0){
            return al;
        }
        return pad(al,"",digits);
    }
    public ArrayList<String> pad(ArrayList<String> al,String p,String up){
        if(up.length()==0){
            al.add(p);
            return al;
        }
        int digit=up.charAt(0)-'0';
        int s=(digit-2)*3;
        int e=s+3;
        if(digit==7){
            e++;
        }
        else if(digit==8){
            s++;
            e++;
        }
        else if(digit==9){
            s++;
            e+=2;
        }
        for(int i=s;i<e;i++){
            char ch=(char) ('a'+i);
            pad(al,p+ch,up.substring(1));
        }
        return al;
    } 
}