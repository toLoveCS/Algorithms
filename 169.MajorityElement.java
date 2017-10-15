//169.MajorityElement
//time o(nlogn)
//space o(1)

class Solution {
    public int majorityElement(int[] nums) {
    	Arrays.sort(nums);
    	int length = nums.length;
    	if(length % 2 == 0)
    		return nums[length/2-1];
    	else
    		return nums[length/2];
    }
}

//learn from discuss
//time o(n)
//space o(1)

class Solution {
	public int majorityElement(int[] nums) {
		int maj = nums[0];
		int count = 1;
		for(int i = 1 ; i < nums.length ; i++){
			if(count == 0){
				maj = nums[i];
				count++;
			}
			else if(maj != nums[i]){
				count--;
			}
			else if(maj == nums[i]){
				count++;
			}
		}

		return maj;
	}

}

