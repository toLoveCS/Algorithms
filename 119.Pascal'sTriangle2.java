import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> list1 = new ArrayList<>();
    	List<Integer> list2 = new ArrayList<>();
    	for(int i = 0 ; i < rowIndex + 1 ; i++){
    		for(int j = 0 ; j <= i ; j++){
    			if(i % 2 == 0){
    				if(j == 0) list1.add(1);
    				if(j == i && i != 0) list1.add(1);
    				if(j > 0 && j < i){
    				Integer tmp = list2.get(j)+list2.get(j-1);
    				list1.add(tmp);
    				}
    			}
    			else{
    				if(j == 0) list2.add(1);
    				if(j == i && i != 0) list2.add(1);
    				if(j > 0 && j < i){
    				Integer tmp = list1.get(j)+list1.get(j-1);
    				list2.add(tmp);
    				}
    			}
    		}
    		if(i % 2 == 0)
        	list2.clear();
    		else
    		list1.clear();
    	}
	
    	if(rowIndex % 2 == 0)
        return list1;
    	else
    	return list2;
    }
}