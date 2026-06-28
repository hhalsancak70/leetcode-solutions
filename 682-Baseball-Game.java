class Solution {
    public int calPoints(String[] operations) {
        List<Integer> records = new ArrayList<>();

        for (String x : operations) {
            if (x.equals("+")) {
                int n = records.size();
                int sum = records.get(n - 1) + records.get(n - 2);
                records.add(sum);
            } 
            else if (x.equals("D")) {
                int n = records.size();
                int doubleScore = records.get(n - 1) * 2;
                records.add(doubleScore);
            } 
            else if (x.equals("C")) {
                records.remove(records.size() - 1);
            } 
            else {
                records.add(Integer.parseInt(x));
            }
        }

        int totalSum = 0;
        for (int score : records) {
            totalSum += score;
        }
        
        return totalSum;
    }
}