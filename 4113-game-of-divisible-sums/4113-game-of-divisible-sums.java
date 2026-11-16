class Solution {
    public long maxDifference(int[] nums) {
        int n=nums.length;
        long[] dp=new long[n+1];
        for(int i=n-1;i>=0;i--){
            long sum=nums[i];

            long a=(sum%3==0)
                ?sum-dp[i+1]
                :sum+dp[i+1];
            long b=Long.MIN_VALUE;
            if(i+1<n){
                sum+=nums[i+1];
                b=(sum%3==0)
                    ?sum-dp[i+2]
                    :sum+dp[i+2];
                
            }
            dp[i]=Math.max(a,b);
            
        }
        return dp[0];
    }
}