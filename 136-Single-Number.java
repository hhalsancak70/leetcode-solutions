class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                seen.remove(num); // Sayı zaten varsa kümeden çıkar
            } else {
                seen.add(num);    // Sayıyı ilk kez görüyorsak kümeye ekle
            }
        }
        return seen.iterator().next();
    }
}