class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int[] num=new int[l];
        int p=0;
        int n=1;
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                num[p]=nums[i];
                p+=2;
            }
            else{
                num[n]=nums[i];
                n+=2;
            }
        }
        return num;
    }
}