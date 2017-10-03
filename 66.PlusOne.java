//2017/10/3
//time complexity o(n)
//space o(n)
class Solution {
    public int[] plusOne(int[] digits) {
    	boolean cin = true;
    	int i = digits.length - 1;
   		while(cin && i >= 0){
    		if(digits[i] + 1 == 10)
    			digits[i--] = 0;
    		else{
    			cin = false;
    			digits[i] += 1;
    		}
    	}
    	if(i == -1 && cin){
    		int[] result = new int [digits.length+1];
    		result[0] = 1;
    		for(int j = 1 ; j < digits.length + 1 ; j++)
    			result[j] = digits[j-1];
    		return result;
    	}

    	return digits;
    }
}