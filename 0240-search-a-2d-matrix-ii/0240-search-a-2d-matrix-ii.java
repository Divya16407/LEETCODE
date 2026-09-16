class Solution {
    public boolean search(int[] m,int t){
        int s=0;
        int e=m.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(m[mid]==t){
                return true;
            }
            if(m[mid]>t){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] arr, int t) {
        int i=0;
        while(i<arr.length && arr[i][0]<=t){
            if(arr[i][0]==t){
                return true;
            }
            if(search(arr[i],t)){
                return true;
            };
            i++;
        }
        return false;
    }
}