class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] num1 = new int[nums.length]; // smaller
        int[] num2 = new int[nums.length]; // greater
        int[] num3 = new int[nums.length]; // equal

        int a = 0, b = 0, c = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < pivot) {
                num1[b] = nums[i];
                b++;
            }

            if (nums[i] == pivot) {
                num3[c] = nums[i];
                c++;
            }

            if (nums[i] > pivot) {
                num2[a] = nums[i];
                a++;
            }
        }

        
        int[] result = new int[a + b + c];

        
        System.arraycopy(num1, 0, result, 0, b);

      
        System.arraycopy(num3, 0, result, b, c);

        
        System.arraycopy(num2, 0, result, b + c, a);

        return result;
    }
}