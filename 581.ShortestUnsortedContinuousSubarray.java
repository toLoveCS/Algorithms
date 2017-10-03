class Solution {
    public int findUnsortedSubarray(int[] nums) {
    	int start = 0;
    	int end = 0;
    	for(int i = 0 ; i < nums.length-1 ; i++)
    	{
    		if(nums[i] > nums[i+1])
    			{
    				start = i;
    				break;
    			}
    	}
    	for(int j = nums.length-1 ; j > 0 ; j--)
    	{
    		if(nums[j] < nums[j-1])
    		{
    			end = j;
    			break;
    		}
        }

    	int max = nums[start];
    	int min = nums[start];
    	for(int r = start+1 ; r <= end ; r++ )
    	{
    		if(nums[r] > max) max = nums[r];
    		if(nums[r] < min) min = nums[r];
    	}
   
       	while(start > 0&&min < nums[start-1] )
    	{
    		start--;
    	}

    	while(end < nums.length-1 && max > nums[end+1])
    	{
    		end++;
    	}
        
        if(end > start)
        return end-start+1;
        else
        return 0;
    }
}