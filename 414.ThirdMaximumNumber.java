class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int thirdMaxNum = 0;
        int secondMaxNum = 0;
        int firstMaxNum = nums[nums.length-1];
        boolean secFlag = false;
        boolean thirdFlag = false;

        if(nums.length < 3)//元素少于3个
        	return firstMaxNum;

        int i = nums.length - 2 ;
        for(i = nums.length - 2 ; i >= 0 ; i--)
        {
        	if(nums[i] != firstMaxNum )
        	{
        		secondMaxNum = nums[i];
        		secFlag = true;
        		break;
        	}
        }
        for(; i >= 0 ; i--)
        {
        	if(nums[i] != secondMaxNum )
        	{
        		thirdMaxNum = nums[i];
        		thirdFlag = true;
        		break;
        	}
        }

        if(thirdFlag) return thirdMaxNum;
        else return firstMaxNum;

    }
}

//时间复杂度o(n)
//空间复杂度o(1)
//learn by discuss
class Solution {
    public int thirdMax(int[] nums) {

        Integer thirdMaxNum = null;
        Integer secondMaxNum = null;
        Integer firstMaxNum = null;

        for(Integer n : nums)
        {
        	if(n.equals(firstMaxNum) || n.equals(secondMaxNum) || n.equals(thirdMaxNum)) continue;
        	if(firstMaxNum == null || n > firstMaxNum) 
        	{
        		thirdMaxNum = secondMaxNum;
        		secondMaxNum = firstMaxNum;
        		firstMaxNum = n;
        	}
        	else if(secondMaxNum == null || n > secondMaxNum)
        	{
        		thirdMaxNum = secondMaxNum;
        		secondMaxNum = n;
        	}
        	else if(thirdMaxNum == null || n > thirdMaxNum)
        	{
        		thirdMaxNum = n;
        	}
        }
        

        return thirdMaxNum == null ? firstMaxNum : thirdMaxNum;

    }
}