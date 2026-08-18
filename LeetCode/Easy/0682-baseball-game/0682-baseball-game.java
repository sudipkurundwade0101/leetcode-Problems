class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> s1 = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            String op = operations[i];

            // Cancel previous score
            if (op.equals("C")) {
                s1.pop();
            }

            // Double previous score
            else if (op.equals("D")) {
                int n = s1.peek();
                s1.push(n * 2);
            }

            // Add previous two scores
            else if (op.equals("+")) {
                int last = s1.get(s1.size() - 1);
                int secondLast = s1.get(s1.size() - 2);

                s1.push(last + secondLast);
            }

            // It is a number
            else {
                int num = Integer.parseInt(op);
                s1.push(num);
            }
        }

        // Calculate final sum
        int sum = 0;

        while (!s1.isEmpty()) {
            sum += s1.pop();
        }

        return sum;
    }
}