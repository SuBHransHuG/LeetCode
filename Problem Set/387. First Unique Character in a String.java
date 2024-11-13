class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();   
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (lhm.containsKey(ch)) {
                lhm.put(ch, -1); 
            } else {
                lhm.put(ch, i); 
            }
        }

        for (int index : lhm.values()) {
            if (index != -1) {
                return index;
            }
        }

        return -1;
    }
}
