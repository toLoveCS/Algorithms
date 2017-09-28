//方法1 2017/9/28
//时间复杂度o(n)
//空间复杂度o(n)
class Solution {
    public void rotate(int[] nums, int k) {
 		int step = k % nums.length;
 		if(step == 0) return;

 		int[] tmp = new int [step];
 		int i = 0; 
 		int j = step;
 		for( i = nums.length - 1 ; i >= 0 ; i-- )
 		{
 			if( j > 0 )
 			{
 				tmp[j-1] = nums[i];
 				j--;
 			}
 			else
 			{
 				nums[i+step] = nums[i];
 			}
 		}
 		for( i = 0 ; i < step ; i++ )
 		{
 			nums[i] = tmp[i];
 		}
 		return;
    }
}

//方法2 
//时间复杂度o(n)
//空间复杂度o(n)
//learn from others
class Solution {
    public void rotate(int[] nums, int k) {
 		k %= nums.length;
 		if(k == 0) return;

 		int[] tmp = new int [nums.length];
 		System.arraycopy(nums,nums.length-k,tmp,0,k);
 		System.arraycopy(nums,0,tmp,k,nums.length-k);
 		System.arraycopy(tmp,0,nums,0,nums.length);
 		
 		return;
    }
}


//方法3
//时间复杂度o(n)
//空间复杂度o(1)
//learn from others
class Solution {
    public void rotate(int[] nums, int k) {
 		k %= nums.length;
 		if(k == 0) return;

 		swap(nums,0,nums.length-1);
 		swap(nums,0,k-1);
 		swap(nums,k,nums.length-1);
 		
 		return;
    }

    public void swap(int[]nums,int start,int end){
    	int tmp = 0;
    	for(int i = start,j = end;i < j ;i++, j--)
    	{
			tmp = nums[i];
    		nums[i] = nums[j];
    		nums[j] = tmp;    		
    	}

    }
}
