//121. Best Time to Buy and Sell Stock 
//2017/10/09
//time o(n)
//space o(1)
class Solution {
    public int maxProfit(int[] prices) {
    	if(prices.length <= 1) return 0;      
      	Integer min = null;		
      	Integer max = null;
      	int res = 0;
        for(int i = 0 ; i < prices.length ; i++){
          if(i + 1 < prices.length && prices[i] < prices[i+1] && (min == null || prices[i] < min)){
            min = prices[i];
            max = prices[i+1];        
          }
          if(max != null && max < prices[i])
            max = prices[i];
          if(max != null && min != null && res < max - min)
            res = max - min;
        }
      
      	return res;
    }
}

//learn by others
//2017/10/09
//time o(n)
//space o(1)
class Solution {
    public int maxProfit(int[] prices) {
    	if(prices.length <= 1) return 0;      
      	Integer min = null;		
      	int res = 0;
        for(int i = 0 ; i < prices.length ; i++){
          if( min == null || prices[i] < min)
            min = prices[i];     
          if(prices[i] - min > res)
          	res = prices[i] - min;
        }
      	return res;
    }
}