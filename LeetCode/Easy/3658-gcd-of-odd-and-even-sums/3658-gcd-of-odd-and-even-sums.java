class Solution {
    public int gcdOfOddEvenSums(int n) {

        int first=0, second=0;
        for (int i=0;i<n*2;i++){

            if(i%2==0){
                first+=i;
            }
            if(i%2!=0){
                second+=i;
            }

            

        }
        return GCD(first,second);
    }

    public static int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}