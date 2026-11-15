class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> l1 =new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(l1.contains(nums[i])){
                return true;
            }
            l1.add(nums[i]);
        }
        return false;
    }
}