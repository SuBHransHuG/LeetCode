class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int n= nums.length;
        for(int i : nums){
            hs.add(i);
        }
        if(hs.size() == n)
        return false;
        else
        return true;
    }
}
