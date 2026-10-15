class Solution {
    public boolean isPerfectSquare(int num) {
        int s=0;
        int e=num;
        while(s<=e){
            int m=s+(e-s)/2;
            long x=(long)m*m;
            if(num==x){
                return true;
            }
            if(x<num){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return false;
    }
}