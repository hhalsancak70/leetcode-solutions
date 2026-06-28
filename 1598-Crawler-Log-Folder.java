class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        
        for (String x : logs) {
            if (x.equals("../")) {
                if (depth > 0) {
                    depth--; // Bir üst klasöre çık
                }
            } else if (!x.equals("./")) {
                depth++;     // Yeni klasöre gir
            }
        }
        
        return depth;
    }
}