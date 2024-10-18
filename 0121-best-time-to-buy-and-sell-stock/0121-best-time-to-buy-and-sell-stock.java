class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length == 1) return 0;

  
        int minbuySoFar = prices[0];  
        int maxProfit = 0;  

        for (int i = 0; i < prices.length; i++) {
            
            int currProfit = prices[i] - minbuySoFar;

   
            if (currProfit > maxProfit) {
                maxProfit = currProfit;
            }

            
            minbuySoFar = Math.min(minbuySoFar, prices[i]);
        }

       
        return maxProfit;
    }
}