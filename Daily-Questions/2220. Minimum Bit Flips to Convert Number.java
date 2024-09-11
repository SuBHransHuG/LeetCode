class Solution {
public int flipBits(int n){
    int count =0;
    while(n!=0){
        count++;
        n&=(n-1);
        
    }
    return count;
}

    public int minBitFlips(int start, int goal) {
        return flipBits(start^goal);
    }
}
