class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        
        int [][]nums =new int[n][n];
        int [][]ans =new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=grid[i][(j+rowShift[i])%n];
            }

        }

         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=nums[(i+colShift[j])%n][j];
            }

        }

        return ans;


    }
}