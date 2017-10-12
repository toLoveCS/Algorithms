//DP 2017/10/12
//b[j]=max{b[j-1]+a[j],a[j]}
//time o(n)
//space o(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0] ,b = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
          if(b < 0) 
            b = nums[i];
          else
            b += nums[i];
          if(b > sum)
            sum = b;
         }

        return sum;
    }
}

//divide and conquer 2017/10/ 
//time o()
//space o()

