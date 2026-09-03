class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> z = new Stack<>();
        int max = 0;

        z.push(-1);

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {
                z.push(i);
            }
            else {
                z.pop();

                if(z.empty()) {
                    z.push(i);
                }
                else {
                    max = Math.max(max, i - z.peek());
                }
            }
        }

        return max;
    }
}