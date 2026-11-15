class Solution {
    public int majorityElement(int[] nums) {

        HashMap <Integer,Integer> m1 = new HashMap<>();

        int larger=0;
        int value=0;

        for(int i =0;i<nums.length;i++){
            m1.put(nums[i],m1.getOrDefault(nums[i],0)+1);

            if(m1.get(nums[i])>value){
                larger=nums[i];
                value=m1.get(nums[i]);
            }

        }
        return larger;
        
    }
}