class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i =0;i<arr.length;i++){
        String binaryString = Integer.toBinaryString(i);
        char[] charArr = binaryString.toCharArray();
        int m =0;
        for(char j: charArr){
            if(j=='1')
            m++;
        }
        arr[i] = m;
        }
        return arr;
    }
}
