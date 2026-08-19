class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        Map<String, Integer> map = new HashMap<>();

        String[] n1 = s1.split(" ");
        String[] n2 = s2.split(" ");

        // Count words from s1
        for (int i = 0; i < n1.length; i++) {
            map.put(n1[i], map.getOrDefault(n1[i], 0) + 1);
        }

        
        for (int i = 0; i < n2.length; i++) {
            map.put(n2[i], map.getOrDefault(n2[i], 0) + 1);
        }

        String[] arr = new String[map.size()];
        int j = 0;

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                arr[j] = key;
                j++;
            }
        }

        return Arrays.copyOf(arr, j);
    }
}