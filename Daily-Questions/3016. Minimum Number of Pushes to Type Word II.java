class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : word.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>(hm.values());
        Collections.sort(al,Collections.reverseOrder());
        int tp = 0;
        for (int i = 0; i < al.size(); i++) {
           if(al.get(i) == 0) break;
           tp +=(i/8+1)*al.get(i);
        }
        return tp;
    }
}
