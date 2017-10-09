//122. Best Time to Buy and Sell Stock II 
//2017/10/09
//time o()
//space o()

class Solution {
    public int maxProfit(int[] prices) {
      	int res = 0;
      	for(int i = 0 ; i < prices.length - 1 ; i++){
      		if(prices[i] < prices[i+1]){
      			res = res + prices[i+1] - prices[i];
      		}
      	}
      	
      	return res; 
    }
}

//num[j]-(j-i-1+num[i])+(j-i-1)
//有差值就卖至少和利益差值最大时卖的利润一样多