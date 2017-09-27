//time o(n^2)
//space o(n^2)

class Solution {
    public int[][] imageSmoother(int[][] M) {
    	int row = M.length;
    	int col = M[0].length;
    	int[][] result = new int [row][col];
    	int i = 0,j = 0;


    	if(row == 1 && col == 1) 
    	{
    		result[i][j] = M[i][j];
    		return resukt;
    	}
    	if(row == 1)
    	{
    		for( i = 0,j = 0 ; j < col ; j++ )
    		{
    			if( j == 0 && j + 1 < col )
    			{
    				result[i][j] = (M[i][j] + M[i][j+1]) / 2;
    			}
    			else if( j == col - 1 && j - 1 >= 0)
    			{
    				result[i][j] = (M[i][j] + M[i][j-1]) / 2;
    			}
    			else
    			{
    				result[i][j] = (M[i][j] + M[i][j-1]+ M[i][j+1]) / 3;
    			}
    		}
    		return result;
    	}

    	if(col == 1)
    	{
			for( i = 0,j = 0 ; i < row ; i++ )
    		{
    			if( i == 0 && i + 1 < row )
    			{
    				result[i][j] = (M[i][j] + M[i+1][j]) / 2;
    			}
    			else if( i == row - 1 && i - 1 >= 0)
    			{
    				result[i][j] = (M[i][j] + M[i-1][j]) / 2;
    			}
    			else
    			{
    				result[i][j] = (M[i-1][j] + M[i+1][j]+ M[i][j]) / 3;
    			}
    		}
    		return result;
    	}


    	for(  i = 0 ; i < row ; i++ )
    	{
    		for( j = 0 ; j < col ; j++ )
    		{
    			if( i + 1 < row && j + 1 < col && i == 0 &&  j == 0 )
    			{
    				result[i][j] = (M[i][j] + M[i+1][j] + M[i][j+1] + M[i+1][j+1]) / 4;
    			}
    			else if( i + 1 < row && j - 1 >= 0 && i == 0  && j == col - 1 )
    			{
  					result[i][j] = (M[i][j] + M[i+1][j] + M[i][j-1] + M[i+1][j-1]) / 4;  				
    			}
    			else if( i - 1 >= 0 && j + 1 < col && i == row - 1 && j == 0 )
    			{
    				result[i][j] = (M[i][j] + M[i-1][j] + M[i][j+1] + M[i-1][j+1]) / 4;
    			}
    			else if( i - 1 >= 0 && j - 1 >= 0 && i == row - 1 && j == col - 1 )
    			{
    				result[i][j] = (M[i][j] + M[i-1][j] + M[i][j-1] + M[i-1][j-1]) / 4;
    			}
    			else if( i + 1 < row && j - 1 >= 0 && j + 1 < col && i == 0 )
    			{
    				result[i][j] = (M[i][j] + M[i][j-1] + M[i+1][j-1] + M[i+1][j] + M[i][j+1] + M[i+1][j+1]) / 6;
    			}
    			else if( i - 1 >= 0 && j - 1 >= 0 && j + 1 < col && i == row - 1 )
    			{
    				result[i][j] = (M[i][j] + M[i][j-1] + M[i-1][j-1] + M[i-1][j] + M[i][j+1] + M[i-1][j+1]) / 6;
    			}
    			else if( j + 1 < col && i - 1 >= 0 && i + 1 < row && j == 0 )
    			{
    				result[i][j] = (M[i][j] + M[i][j+1] + M[i-1][j] + M[i-1][j+1] + M[i+1][j] + M[i+1][j+1]) / 6;
    			}
    			else if( j - 1 >= 0 && i - 1 >= 0 && i + 1 < row && j == col - 1 )
    			{
    				result[i][j] = (M[i][j] + M[i][j-1] + M[i+1][j-1] + M[i+1][j] + M[i-1][j] + M[i-1][j-1]) / 6;
    			}
    			else
    			{
    				result[i][j] = (M[i][j] + M[i-1][j-1] + M[i-1][j] + M[i-1][j+1] + M[i][j-1] + M[i][j+1] + M[i+1][j-1] + M[i+1][j] + M[i+1][j+1]) / 9;
    			}



    		}
    	}
     return result; 
    }
}

//time o(n^2)
//space o(n^2)
//learn from discuss
class Solution {
    public int[][] imageSmoother(int[][] M) {
    	if(M == null) return null;

    	int row = M.length;
    	int col = M[0].length;
    	int sum = 0;
    	int num = 0;
    	int[][] result = new int[row][col];

    	for(int i = 0 ; i < row ; i++){
    		for(int j = 0 ; j < col ; j++){
    			for(int incRow:new int[]{-1,0,1}){
    				for(int incCol:new int[]{-1,0,1}){
    					if(judgeBoundary(i,j,row,col,incRow,incCol)){
    						sum += M[i+incRow][j+incCol];
    						num++;
    					}
    				}
    			}
    			result[i][j] = sum / num;
    			sum = 0;
    			num = 0;
    		}
    	}
    	return result;
    }

	public boolean judgeBoundary(int i,int j,int row,int col,int incRow,int incCol) {
    	if(i + incRow >= 0 && i + incRow < row && j + incCol >= 0 && j + incCol < col) return true;
    	else return false;
    }

}
