class Solution {
    public List<String> buildArray(int[] target, int n) {

        Stack<String> operations = new Stack<>();

        int current = 1;

        for (int num : target) {

            while (current < num) {
                operations.push("Push");
                operations.push("Pop");
                current++;
            }

            operations.push("Push");
            current++;
        }

        return operations;
    }
}