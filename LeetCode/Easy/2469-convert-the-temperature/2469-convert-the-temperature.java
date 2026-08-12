class Solution {
    public double[] convertTemperature(double celsius) {

        double [] nums=new double[2];


        nums[0]=celsius+273.15;
        nums[1]=celsius*1.80+32.00;

        return nums;

        
    }
}