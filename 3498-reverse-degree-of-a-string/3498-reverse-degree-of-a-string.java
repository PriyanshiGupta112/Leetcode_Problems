class Solution {
    public int reverseDegree(String s) {
        int total=0;
        for (int i=0;i<s.length();i++) {
            int rev=26-(s.charAt(i) - 'a');
            int stringIdx = i + 1; 
            total+=rev*stringIdx;
        }
        
        return total;
    }
}