class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=Integer.MIN_VALUE;
        if(prices.length<=1){
            return 0;
        }
        for(int i=1;i<prices.length;i++){
            int currentProfit=prices[i]-buy;
            maxProfit=Math.max(maxProfit,currentProfit);
            if(maxProfit<0){
                maxProfit=0;
            }
            buy=Math.min(buy,prices[i]);
        }
        return maxProfit; 
    }
}