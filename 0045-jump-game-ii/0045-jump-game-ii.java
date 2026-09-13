class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1) return 0;
        int max=0,j=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,i+nums[i]);
            if(i==count){
                j++;
                count=max;
                
                if(count>=nums.length-1){
                    break;
                }
            }
        }
        return j;
    }
}