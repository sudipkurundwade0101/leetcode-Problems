class Solution {
    public int findShortestSubArray(int[] nums) {


        HashMap <Integer,Integer> map = new HashMap<>();
        int max=0;

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            int n=map.getOrDefault(num,0);

            if(max<n){
            max=n;
            }


        }
       HashMap<Integer,Integer> hm=new HashMap<>();
        int windowsize=Integer.MIN_VALUE;
        int res=Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<nums.length){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            windowsize=Math.max(windowsize,hm.get(nums[j]));
            while(windowsize==max){
                res=Math.min(res,j-i+1);
                hm.put(nums[i],hm.get(nums[i])-1);
                if(hm.get(nums[i])==0)
                    hm.remove(nums[i]);
                if(nums[i]==nums[j])
                    windowsize--;
                i++;
            }
            j++;
        }
        return res;
        
    }
}