class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> m1= new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
           m1.put(nums[i],i);


        }

        for(int i=0;i<nums.length;i++){

            int sub = (target-nums[i]);

            if(m1.containsKey(sub)&& m1.get(sub)!=i){
                return new int[]{i,m1.get(sub)};
            }
        }
        return new int[] {};
    }
}