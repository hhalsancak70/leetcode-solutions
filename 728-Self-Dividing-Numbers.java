class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();
        
        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                numbers.add(num);
            }
        }
        
        return numbers;
    }
    
    private boolean isSelfDividing(int n) {
        int temp = n;
        
        while (temp > 0) {
            int digit = temp % 10;
            
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            
            temp = temp / 10;
        }
        
        return true;
    }
}