class Solution {
    public int reverseBits(int n) {

       String s= NotoBinary(n);

       System.out.println(s);


       int r =BinarytoNo(s);
       
        return r;
        
    }

    public String NotoBinary (int n){
        StringBuilder s = new StringBuilder("");
        int count=0;
        while (n!=0){
            int rem = n%2;
            s.append(rem);
            n=n/2;
            count++;
        }
        StringBuffer b = new StringBuffer();

        for(int i=0;i<32-count;i++){
            s.append(0);
        }



        return s.reverse().toString();


    }

    public int BinarytoNo(String s){
        int result=0;
        StringBuilder m = new StringBuilder(s);
        
        for(int i=0;i<s.length();i++){
            int ch= m.charAt(i);

            if(ch=='1'){
                int rem= (int)(Math.pow(2,i));
                result=rem+result;
            }



        }

        return result;
    }


}