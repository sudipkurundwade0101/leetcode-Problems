class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int sum=0;

        for (int i=0;i<nums.size();i++){


            if(binary(i)==k){
                sum=sum+nums.get(i);
            }

            }


        
        return sum;
}
    

    public int binary(int n){

        int s=0;

        while(n!=0){
            int rem=n%2;
            s=s+rem;
            n=n/2;
        }

        return s;


    }
}