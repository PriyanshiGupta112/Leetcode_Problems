class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=0;
        int rmax=0;
        int w=0;
        while(l<r){
            if(height[l]<=height[r]){
                if(height[l]>=lmax){
                    lmax=height[l];
                }
                else{
                    w+=lmax-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rmax){
                    rmax=height[r];
                }
                else{
                    w+=rmax-height[r];
                }
                r--;
            }
            
        }
        return w;
    }
}