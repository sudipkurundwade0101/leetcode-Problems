class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int sum = 0;
        int left = 0;
        double maxSum = Integer.MIN_VALUE;
        

        for(int right = 0; right < nums.length; right++)
        {
            sum = sum + nums[right];

            if((right - left + 1) == k)
            {
                maxSum = Math.max(maxSum, sum);
                sum = sum - nums[left];
                left++;
            }
          
        }
        double maxAvg = maxSum/k;
        return maxAvg;
    }
}