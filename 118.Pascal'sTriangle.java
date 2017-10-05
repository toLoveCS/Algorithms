class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> vecRes = new ArrayList<List<Integer>>();
    	for(int i = 0 ; i < numRows ; i++){
    		List<Integer> list = new ArrayList<Integer>();
    		for(int j = 0 ; j <= i ; j++){
    			if(j == 0 || j == i) list.add(1);
    			else 
    				list.add(vecRes.get(i-1).get(j-1)+vecRes.get(i-1).get(j));		                                          
    		}
    		vecRes.add(list);
    	}
        return vecRes;
    }
}                                                                                