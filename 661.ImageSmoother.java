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