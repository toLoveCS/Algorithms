class Solution {//learn from discuss
    public int missingNumber(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = nums[0];
        int sumLength = nums.length;
        for(int i = 1 ; i < nums.length ; i++){
        	sum += nums[i];
        	if(nums[i] < min) min = nums[i];
        	if(nums[i] > max) max = nums[i];
        }
		int result = 0;
        if(min == 0){
            min = 1;
            sumLength = nums.length - 1;
        }
        int length = max;
        if(sum == (min + max) * sumLength / 2 && sumLength == nums.length) return 0;
        if(sum == (min + max) * length / 2 && length == sumLength) return sumLength + 1;  
        
        result = (min + max) * nums.length / 2 - sum;
        return result;
    }
}



class Solution {//learn from others
    public int missingNumber(int[] nums) {

        int sum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            sum += nums[i];
        }
        int expected = nums.length * (nums.length + 1) / 2;
        return expected - sum;
    }
}