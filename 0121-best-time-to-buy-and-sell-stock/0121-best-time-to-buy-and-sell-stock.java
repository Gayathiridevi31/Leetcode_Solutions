class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
        
    }
}