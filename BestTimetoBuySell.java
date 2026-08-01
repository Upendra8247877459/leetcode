class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        int i=1;
        while(i<prices.length) {
            if(buy>prices[i])
              buy=prices[i];
            else
               profit = Math.max(profit, prices[i] - buy);
            i++;
        }
        return profit;
    }
}
