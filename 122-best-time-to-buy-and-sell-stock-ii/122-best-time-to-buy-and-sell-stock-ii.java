class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;//total days
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1])//if prices of current day is less than previous day then
                profit+=(prices[i]-prices[i-1]);//profit current day -previous day
        }
        return profit;
    }
}