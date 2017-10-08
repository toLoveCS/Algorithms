//2017/10/08
//time o(n)
//space o(n)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int empspace = 0;
        int zero = 0;
        int num = 0;
        List<Integer> list = new ArrayList<>();
 		if(flowerbed[0] == 1){
 			list.add(0);       
 			num++;
 		} 
        for(int i = 0 ; i < flowerbed.length ; i++){
        	if(flowerbed[i] == 0){
        		zero++;
        	}
        	else{
        		if(zero > 0){
        			list.add(zero);
        			num++;
        		}
        		zero = 0;
        	}

        }

        if(list.isEmpty())
            empspace = (zero + 1) / 2; 
        else{
            empspace = list.get(0) / 2;
            for(int j = 1 ; j < num ; j++){
        	    if(list.get(j) >= 3)
        		    empspace = empspace + (list.get(j)-1) / 2;
            }
            if(zero > 0)
        	    empspace = empspace + zero / 2;
        }

        if(empspace >= n) 
        	return true;
        else
        	return false;

    }
}

//2017/10/08 learn from others
//time o(n)
//space o(n)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0,count = 0;
        for(i = 0 ; i < flowerbed.length ; i++){
        	if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1 || flowerbed[i+1] == 0)){
        		flowerbed[i] = 1;
        		count++;
        		}
        }

        return count >= n;
    }
}