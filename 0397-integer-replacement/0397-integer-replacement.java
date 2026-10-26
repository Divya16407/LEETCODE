class Solution {
    public int integerReplacement(int n) {
        return temp(n,0);
    }
    public int temp(long n,int c){
        if(n==1){
            return c;
        }
        if(n%2==0){
            return temp(n/2,c+1);
        }
        else{
            return Math.min(temp(n-1,c+1),temp(n+1,c+1));
        }
    }   
}