class Solution {
    public int minSteps(int n) {
        int m=(int)Math.sqrt(n);
        int sum=0;
        int num=n;

for(int j=0;j<num;j++){
    
    if(n==0){
        break;
    }
        for(int i=2;i<=num;i++){
            if(n%i==0){
                sum=sum+i;
                n=n/i;
                break;
            }
        }
}

      return sum;
    }
}