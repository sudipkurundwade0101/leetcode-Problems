class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : friends) {
            set.add(x);
        }

        int[] ans = new int[friends.length];
        int j = 0;

        for (int x : order) {
            if (set.contains(x)) {
                ans[j++] = x;
            }
        }

        return ans;
    }
}