class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        int n = sb.length();

        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) == sb.charAt(n - i - 1)) {
                continue;
            }
            return false;
        }

        return true;
    }
}