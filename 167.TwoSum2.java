class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int[] index = new int[2];

    	if( numbers.length < 2 )
    	return index;

    	int findkey = 0;
    	int start = 0;
    	int end = numbers.length - 1;
    	int mid = 0;
    	for( int i = 0 ; i < numbers.length - 1; i++ )
    	{
    		findkey = target - numbers[i];

    		start = i + 1;
    		end = numbers.length - 1;
    		while(start <= end)
    		{
    			mid = (start + end)/2;

    			if(numbers[mid] == findkey)
    			{
    				index[0] = i+1;
    				index[1] = mid+1;
    				return index;
    			}
    			else if(numbers[mid] > findkey)
    			{
    				end = mid - 1;
    			}
    			else
    			{
    				start = mid + 1;
    			}
    		}

    	}

       return index; 
    }
}