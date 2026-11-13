class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] a1= new int[2];
        

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}