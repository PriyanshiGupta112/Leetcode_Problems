class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] found= new boolean [nums.length+1];
        for(int num:nums){
            found[num]=true;
        }
        for(int i =1; i<=nums.length; i++){
            if(!found[i]){
               ans.add(i);
            }
        }
        return ans;
    }
}