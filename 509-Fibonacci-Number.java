class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        return inFib(0, 1, n);
    }
    
    // Yardımcı metodu (helper function) sınıf seviyesinde tanımlıyoruz
    private int inFib(int first, int second, int stepsLeft) {
        if (stepsLeft == 0) {
            return first;
        }
        
        int temp = second;
        second += first;
        first = temp;
        
        return inFib(first, second, stepsLeft - 1);
    }
}