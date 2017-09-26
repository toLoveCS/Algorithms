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