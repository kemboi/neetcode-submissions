class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            Map<Character, Integer> count = new HashMap<>();

            for(int i=0; i < s.length(); i++){
                char c = s.charAt(i);
                count.put(c, count.getOrDefault(c, 0)+ 1);
            }
             for(int i=0; i < t.length(); i++){
                char c = t.charAt(i);
                int seen = count.getOrDefault(c, 0);
                if (seen == 0){
                    return false;
                }
                count.put(c, seen - 1);
            }
            return true;

    }
}
