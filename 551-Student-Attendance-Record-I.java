class Solution {
    public boolean checkRecord(String s) {
        
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                return false;
            }
        }

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                count++;
                if (count >= 2) {
                    return false;
                }
            }
        }
        
        return true;
    }
}