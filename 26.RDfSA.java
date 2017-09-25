class Solution {
    public int removeDuplicates(int[] nums) {
    	int length = 0;
    	if(nums.length > 0)
    	{
    		int lastvalue = nums[0];
        	int lastindex = 0;
        	length = 1;
        	for(int i = 1; i < nums.length; i++)//标记重复
        	{
        		if(lastvalue == nums[i])
        		{
        			nums[i] = -1000000;
        		}
        		else
        		{
        			lastvalue = nums[i];
        			length++;
        		}

        	}

        	Arrays.sort(nums);//排序

        	for(int j = 0; j < nums.length; j++)
        	{
        		if(nums[j] != -1000000)
        		{
        		    nums[lastindex] = nums[j];
        			lastindex++;
        		}      		
        	}
    	}
    return length;
    }
        
}