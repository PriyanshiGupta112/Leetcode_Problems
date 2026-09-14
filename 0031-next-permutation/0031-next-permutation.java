class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p!=-1){
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[p]){
                    int temp=nums[p];
                    nums[p]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
        }
        int l=p+1;
        int r=nums.length-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        
    }
}