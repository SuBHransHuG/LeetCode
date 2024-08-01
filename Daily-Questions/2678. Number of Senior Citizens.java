class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        int n = details.length;
        for(int i=0;i<n;i++){
            int p = Integer.parseInt(details[i].substring(11, 13));
            if(p>60){
                count++;
            }
        }
        return count;
    }
}
