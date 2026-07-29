class Solution {
    public int scoreOfString(String s) {

        int n=0;

        for(int i=0;i<s.length()-1;i++){
            int num1=s.charAt(i);
            int num2=s.charAt(i+1);

            n=n+(Math.abs(num1-num2));
        }

        return n;
        
    }
}