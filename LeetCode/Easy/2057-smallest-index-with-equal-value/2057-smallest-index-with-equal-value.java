class Solution {
    public int smallestEqual(int[] nums) {
        int min = 500;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
              if(i % 10 == nums[i]) {
                    min = Math.min(i, min);
            }
        }

        if(min == 500) return -1;
        else return min;
    }
}