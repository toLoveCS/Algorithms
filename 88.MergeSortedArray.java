//88. Merge Sorted Array
//2017/10/10
//time o(m+n)
//space o(m+n)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
  		int[] res = new int [m+n];
  		int i = 0 , j =0 , k = 0;
  		for(i = 0,j = 0,k = 0 ; i < m && j < n ; ){
  			if(nums1[i] <= nums2[j])
  				res[k++] = nums1[i++];		
  			else
  				res[k++] = nums2[j++];
  		}  	
  		while(i < m)
  			res[k++] = nums1[i++]; 
  		
  		while(j < n)
  			res[k++] = nums2[j++];

  		for(i = 0 ; i < m + n ; i++)
        	nums1[i] = res[i];
      
    }
} 

//learn from others
//2017/10/10
//time o(m+n)
//space o(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i = m - 1;
    	int j = n - 1;
    	int k = m + n - 1;
    	while(i >= 0 && j >= 0){
    		if(nums1[i] >= nums2[j])
    			nums1[k--] = nums1[i--];
    		else
    			nums1[k--] = nums2[j--];
    	}
    	while(j >= 0)
    		nums1[k--] = nums2[j--];
  		
    }
} 
