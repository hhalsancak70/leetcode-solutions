class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int currentCount = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], currentCount);
            
            if (currentCount > n / 2) {
                return nums[i];
            }
        }
        
        return -1;
    }
}