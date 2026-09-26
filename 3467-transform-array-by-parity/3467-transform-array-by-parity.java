class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%2;
                
        }
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            if(nums[l]==0){
                l++;
                
            }
            else if(nums[r]==1){
                r--;
            }
            else{
                nums[l]=0;
                nums[r]=1;
                l++;
                r--;
            }
        }
        return nums;
    }
}