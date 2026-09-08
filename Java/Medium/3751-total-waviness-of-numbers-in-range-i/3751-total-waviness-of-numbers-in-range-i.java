class Solution {
    private int waves(int n){
        int count=0;
        while(n>100){
            int r=n%10;
            n/=10;
            int m=n%10;
            n/=10;
            int l=n%10;
            if((m>r && m>l) || (m<r && m<l)){
                count++;
            }
            n=n*10+m;
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int ans=0;
      for(int i=num1;i<=num2;i++){
         ans+=waves(i);
      }
      return ans;  
    }
}