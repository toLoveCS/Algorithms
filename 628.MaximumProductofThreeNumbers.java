//628.MaximumProductofThreeNumbers
//2017/10/13
//time o(n)
//space o(1)

class Solution {
    public int maximumProduct(int[] nums) {
    int max3 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int max1 = Integer.MIN_VALUE;
    int min2 = Integer.MAX_VALUE;
    int min1 = Integer.MAX_VALUE;
    for(int i = 0 ; i < nums.length ; i++){
      if(nums[i] > max3){
        max1 = max2;
        max2 = max3;
        max3 = nums[i];
      }
      else if(nums[i] > max2){
        max1 = max2;
        max2 = nums[i];
      }
      else if(nums[i] > max1){
        max1 = nums[i];
      }

      if(nums[i] < min2){
        min1 = min2;
        min2 = nums[i];
      }
      else if(nums[i] < min1){
        min1 = nums[i];
      }
    }

    int res1 = max1 * max2 * max3;
    int res2 = min1 * min2 * max3;

    return res1 > res2 ? res1 : res2;       
    }
}

//2017/10/13
//time o(nlogn)
//space o(1)
class Solution{
	public int maximumProduct(int[] nums) {
    	Arrays.sort(nums);
     	int length = nums.length;
    	int res1 = nums[length-1] * nums[length-2] * nums[length-3];
    	int res2 = nums[0] * nums[1] * nums[length-1];
    	return res1 > res2 ? res1 : res2; 
    }
}

