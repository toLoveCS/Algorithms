//2017/10/07
//time o(row*col)
//space o(row*col)
class Solution {
   	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if(col * row != r * c) return nums;

        int[][] res = new int[r][c];
        for(int i = 0 ,k = 0 ,l = 0; i < row ; i++){
        	for(int j = 0 ; j < col ; j++){
        		res[k][l] = nums[i][j];
        		if(l < c){
        			l++;
        		}
        		if(l == c){
        			k++;
        			l = 0;
        		} 	
        	}
        }
        return res;
    }
}