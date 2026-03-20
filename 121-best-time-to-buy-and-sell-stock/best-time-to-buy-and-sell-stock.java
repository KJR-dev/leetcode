class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(prices[i]>buy){
                maxProfit=Math.max(maxProfit, prices[i]-buy);
            }
            buy=Math.min(buy,prices[i]);
        }
        return maxProfit; 
    }
}

// class Solution {
//     public int maxProfit(int[] prices) {
//         int n=prices.length;
//         int maxProfit=0;
//         int bestBuy=prices[0];
//         for(int i=0;i<n;i++){
//             if(prices[i]>bestBuy){
//                 maxProfit=Math.max(maxProfit, prices[i]-bestBuy);
//             }
//             bestBuy=Math.min(bestBuy,prices[i]);
//         }
//         return maxProfit;
//     }
// }