class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i : nums1){
            hs1.add(i);
        }
        for(int i : nums2){
            hs2.add(i);
        }
        List<Integer> hs3 = new ArrayList<>();
        List<List<Integer>> al = new ArrayList<>();
        for(int i : hs1){
            if(hs2.contains(i)){
                hs3.add(i);
            }
        }
        for(int i : hs3){
            hs1.remove(i);
            hs2.remove(i);
        }
        al.add(List.copyOf(hs1));
        al.add(List.copyOf(hs2));
        return al;
    }
}
