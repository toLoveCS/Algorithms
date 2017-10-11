//643.MaximumAverageSubarray1
//2017/10/11
//time o(n)
//space o(1)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
    	double res = Double.MIN_VALUE;
      	double tmp = 0;
      	int i = 0;
      	if(nums.length < k || k <= 0) return res;
      	for(i = 0 ; i < k ; i++){
        	res += nums[i];
      	}
      	tmp = res;
      	for( ; i < nums.length ; i++){
        	tmp = tmp - nums[i-k] + nums[i];
        	if(tmp > res)
          	res = tmp;
      	}

      	return res / k;       
    }
}
