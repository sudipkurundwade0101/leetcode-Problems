class Solution {
    public int maxDistinct(String s) {
        Set <Character> map1 = new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            map1.add(ch);
        }

        return map1.size();
        
    }
}