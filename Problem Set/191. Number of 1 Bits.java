class Solution {
    public int hammingWeight(int n) {
        int[] binaryNum = new int[32];

        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        int count =0;
        for(int j : binaryNum){
            if(j == 1)
            count++;
        }
        return count;
    }
}
