class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;
        int max=0;
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int r=0;r<nums.length;r++){

            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum-=nums[l];
                l++;

            }

            set.add(nums[r]);
            sum+=nums[r];

            max=Math.max(max,sum);
        }
        return max;
    }
}