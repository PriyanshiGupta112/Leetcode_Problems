class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int curr=0;
        int sum=0;
        for(int i=0;i<requests.length;i++){
            sum+=Math.abs(requests[i]-curr);
            curr=requests[i];
        }
        return sum;
    }
}