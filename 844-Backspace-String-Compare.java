class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String text) {
        StringBuilder stack = new StringBuilder();
        
        for (char c : text.toCharArray()) {
            if (c != '#') {
                stack.append(c);
            } else if (stack.length() > 0) {
                stack.deleteCharAt(stack.length() - 1);
            }
        }
        
        return stack.toString();
    }
}