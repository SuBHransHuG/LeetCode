class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
      for(String s:arr){
        hm.put(s,hm.getOrDefault(s,0)+1);
      }
      int count =0;
      for(String s:arr){
        if(hm.get(s)==1){
            count++;
        
        if(count==k){
            return s;
        }
        }
      }
      return "";
    }
}
