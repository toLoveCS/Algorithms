class Solution {
    public int findPairs(int[] nums, int k) {
    	Set<Integer> matchSet = (Set<Integer>)new HashSet();
    	HashMap<Integer,Integer> map = new HashMap<>();
    	int res = 0;
    	if(k < 0) return res;
    	for(int i = 0 ; i < nums.length ; i++){
    		if(k == 0){
    			if(map.containsKey(nums[i])){
    				if(map.get(nums[i]) == 0){
    					res++;
    					map.replace(nums[i],1);  					
    				}
    			} 
    			else{
    				map.put(nums[i],0);
    			}
    		}
    		else{
    			if(!matchSet.contains(nums[i]) && matchSet.contains(nums[i]-k)){
    				res++;	
    			}
    			if(!matchSet.contains(nums[i]) && matchSet.contains(nums[i]+k)){
    				res++;	
    			}     
    			matchSet.add(nums[i]); 			
    		}
			
    	}
        return res;
    }
}