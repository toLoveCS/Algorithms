class Soluticlass Solution {
    public boolean checkPossibility(int[] nums) {
 		int times = 0;
 		boolean flag = true;
 		for(int i = 0; i < nums.length-1; i++)
 		{
 			if(nums[i] > nums[i+1])
 			{
 				times++;
 				if(i > 0 && i+1 < nums.length-1 && nums[i-1] > nums[i+1])
 				{
 					if(i + 2 < nums.length)
                    {
                        if(nums[i] > nums[i+2])
                        {
                            flag = false;
 					        break;
                        }
                    }
                    else
                    {
                        flag = false;
 					    break;        
                    }
 				}
 				if(times >= 2)
 				{
 					flag = false;
 					break;
 				}
 			
 			
 			}       

		}
		return flag;
	}
}