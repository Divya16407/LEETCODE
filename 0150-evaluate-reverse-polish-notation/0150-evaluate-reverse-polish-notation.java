class Solution {
    public int poop(Stack<String> s,String s1){
        int x=Integer.parseInt(s.pop());
        int y=Integer.parseInt(s.pop());
        switch(s1){
            case "+":
                return x+y;
            case "-":
                return y-x;
            case "*":
                return x*y;
            case "/":
                return y/x;
        }
        return 0;
    }
    public int evalRPN(String[] tokens) {
        Stack<String> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int t=poop(s,tokens[i]);
                String t1=String.valueOf(t);
                s.push(t1);
            }
            else{
                int q=Integer.parseInt(tokens[i]);
                String q1=String.valueOf(q);
                s.push(q1);
            }
        }
        return Integer.parseInt(s.peek());
    }
}