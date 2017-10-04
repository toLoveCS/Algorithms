class Solution {
public:
    vector<vector<int>> generate(int numRows) {
    	vector<vector<int>> res;
    	res.resize(numRows);
    	for(int k = 0; k < numRows; k++){
    		res[k].resize(k+1);
    		for(int i = 0; i <= k; i++){
    			if(i == 0 || i == k) res[k][i] = 1;
    			else if(i > 0 && i < k){
    				if(k - 1 >= 0){
    					res[k][i] = res[k-1][i-1] + res[k-1][i];
    				}
    			}
    		}
    	}
    	return res;        
    }
};