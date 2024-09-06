class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<>();
        int n = candies.length;
        for(int i =0;i<n;i++){
            Boolean a = true;
            for(int j=0;j<n;j++){
                if((candies[i]+extraCandies)>=candies[j]){
                    a = true;
                }
                else{
                    a = false;
                    break;
                }
               
            }
             al.add(a);
        }
        return al;
    }
}
