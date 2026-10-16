class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i=0;i<points.length-1;i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i+1][0];
            int y2 = points[i+1][1];
            
            time+= Math.max(Math.abs(x2-x1), Math.abs(y2-y1));
        }
        
        return time;
    }
}