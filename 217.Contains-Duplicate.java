/* Hash Set Approach */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (duplicate.contains(nums[i])) {
                return true;
            }

            duplicate.add(nums[i]);
        }

        return false;
    }
}

/* Brute-Force Approach

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
*/