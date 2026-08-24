class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int cnt = 0, max = 0;
        for (int []rectangle: rectangles) {
	    
        
            int side = Math.min(rectangle[0], rectangle[1]); 
            if (side > max) {  
                cnt = 1;
                max = side;  
            }else if (side == max) {
                cnt++; 
            }
        }
        return cnt;
    }
}