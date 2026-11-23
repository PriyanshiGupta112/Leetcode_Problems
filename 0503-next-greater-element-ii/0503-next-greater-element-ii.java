class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] nge=new int[n];
        Arrays.fill(nge, -1);
        for(int i=0;i<2*n;i++){
            int idx=i%n;
            while(!st.isEmpty() && nums[st.peek()]<nums[idx]){
                nge[st.pop()]=nums[idx];
            }
            st.push(idx);
        }
        return nge;
    }
}