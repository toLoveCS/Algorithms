class Solution {
   public int removeElement(int[] nums, int val) {
        
        int length = 0;

        if(nums.length > 0)
        {        
            int lastindex = 0;
            int i = 0;
            boolean flag = false;
            for(i = 0; i < nums.length; i++)
            {
                if(val == nums[i] )
                {
                    if(flag == false)
                    {
                        lastindex = i;
                        flag = true;
                    }
                }
                else
                {
                    nums[lastindex] = nums[i];
                    lastindex++;
                    length++;
                }

            }

        }
    return length;
    }      
}