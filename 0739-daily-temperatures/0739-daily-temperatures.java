class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[n];
        for(int i=0;i<=n-1;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                nge[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        return nge;
    }
}