class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(j>i && prices[j]<=prices[i]){
                    prices[i] = prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
