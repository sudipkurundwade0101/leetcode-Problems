class Solution {
    public int digitFrequencyScore(int n) {
        
        HashMap<Integer,Integer> smap = new HashMap<>();
        int num=n;

        while(n!=0){
            int rem=n%10;
            smap.put(rem,smap.getOrDefault(rem,0)+1);
            n=n/10;
        }
        int sum=0;

        for(int key: smap.keySet()){
            sum=sum+(key*smap.get(key));

        }

        return sum;


    }
}

