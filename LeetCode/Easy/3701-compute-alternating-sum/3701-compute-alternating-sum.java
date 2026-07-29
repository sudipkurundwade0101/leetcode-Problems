class Solution {
    public int alternatingSum(int[] nums) {

        int left=0,right=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                left+=nums[i];
            }
            else{
                right+=nums[i];
            }

        }
        return left-right;
    }
}