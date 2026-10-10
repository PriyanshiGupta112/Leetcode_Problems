class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int t=0;
        for(int num:nums){
            if(num<target){
                count++;
            }
            else if(num==target){
                t++;
            }
        }

        List<Integer> res=new ArrayList<>();
        for(int i=0;i<t;i++){
            res.add(count+i);
        }
        return res;
    }
}