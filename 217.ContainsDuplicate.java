//bruce force
//time complexity o(n^2)
//space complexity o(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
    	boolean result = false;
    	for(int i = 0 ; i < nums.length - 1 ; i++){
    		for(int j = i + 1 ; j < nums.length ; j++){
    			if(nums[i] == nums[j]){
    				result = true;
    				break;
    			}
    		}
    	}
    	return result;
    }
}

//sort
//time complexity o(nlogn)
//space complexity o(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
    	boolean result = false;

    	if(nums.length == 0) return result;

    	Arrays.sort(nums);
    	int lastnum = nums[0];

    	for(int i = 1 ; i < nums.length ; i++){
    		if(lastnum == nums[i]){
    			result = true;
    			break;
    		}
    		else{
    			lastnum = nums[i];
    		}
    		
    	}
    	return result;
    }
}

//time complexity o(n)
//space complexity o(n)
//learn from discuss
class Solution {
    public boolean containsDuplicate(int[] nums) {
    	final Set<String> settmp = (Set<String>)new HashSet();
    	for(int i = 0; i < nums.length; i++)
    	{
    		if(settmp.contains(nums[i])) return true;

    		settmp.add(nums[i]);
    	}

    	return false;
    }
}