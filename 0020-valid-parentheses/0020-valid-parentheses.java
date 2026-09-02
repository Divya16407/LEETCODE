class Solution {
    public boolean isValid(String s) {
        Stack<String> z = new Stack<>();

        String n = String.valueOf(s.charAt(0));

        if (!(n.equals("(") || n.equals("[") || n.equals("{"))) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));

            if (s1.equals("(") || s1.equals("{") || s1.equals("[")) {
                z.push(s1);
            }
            else {
                if (z.empty()) {
                    return false;
                }

                String p = z.peek();

                if ((p.equals("(") && s1.equals(")")) ||
                    (p.equals("{") && s1.equals("}")) ||
                    (p.equals("[") && s1.equals("]"))) {
                    z.pop();
                }
                else {
                    return false;
                }
            }
        }

        if (z.empty()) {
            return true;
        }

        return false;
    }
}