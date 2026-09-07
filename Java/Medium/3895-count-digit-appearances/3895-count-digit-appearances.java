class Solution {

    public int countDigitOccurrences(int[] nums, int digit) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
             sum= sum + count(nums[i],digit);
        }
    return sum;
        
    }

    public int count(int n,int digit){
        int c=0;

        while(n!=0){
            int rem = n%10;
            if(rem==digit){
                c++;
            }
            n=n/10;
        }
        return c;
    }

}