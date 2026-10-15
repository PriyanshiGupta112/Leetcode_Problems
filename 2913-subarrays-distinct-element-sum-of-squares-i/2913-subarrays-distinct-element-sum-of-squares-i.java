class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            HashSet<Integer> distinct=new HashSet<>();
            for(int j=i;j<n;j++){
                distinct.add(nums.get(j));

                int count=distinct.size();
                sum+=count*count;
            }
        }
        return sum;
    }
}