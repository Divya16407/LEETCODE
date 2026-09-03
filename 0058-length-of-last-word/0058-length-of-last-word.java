class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int index=arr.length-1;
        return arr[index].length();
    }
}