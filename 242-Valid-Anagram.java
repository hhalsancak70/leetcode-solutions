class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> letterS = new HashMap<>();
        HashMap<Character, Integer> letterT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            letterS.put(charS, letterS.getOrDefault(charS, 0) + 1);
            letterT.put(charT, letterT.getOrDefault(charT, 0) + 1);
        }
        
        return letterS.equals(letterT);
    }
}