class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> result = new ArrayList<>();
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            result.add(hours * 60 + minutes);
        }
        Collections.sort(result);

        int diff  = Integer.MAX_VALUE;
        for(int i=1;i<result.size();i++){
            diff= Math.min(diff,(result.get(i)-result.get(i-1)));
        }
        int Wrap = (1440-result.get(result.size()-1))+result.get(0);
        diff = Math.min(diff,Wrap);
        return diff;
    }
}
