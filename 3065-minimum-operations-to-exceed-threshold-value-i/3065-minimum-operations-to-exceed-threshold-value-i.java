class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        for(int num:nums){
            if(num<k){
                c++;
            }
        }
        return c;
    }
}