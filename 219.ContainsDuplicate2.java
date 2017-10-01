class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	Integer index = 0;
    	for(Integer i = 0 ; i < nums.length ; i++){
    		if(map.containsKey(nums[i])){
    			index = map.get(nums[i]);
    			if(Math.abs(index-i) <= k) return true;
    			else{
    				map.remove(nums[i]);
    				map.put(nums[i],i);
    			}
    		}
    		else{
    			map.put(nums[i],i);
    		}

    	} 
        
        return false;
    }
}