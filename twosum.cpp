//array 
//two sum


//暴力枚举
class Solution{

public:
	vector<int> twoSum(vector<int>& nums,int target)
	{
		vector<int> result;
		for(int i = 0 ; i < nums.size()-1 ; i++)
			{
				for(int j = i+1 ; j < nums.size() ; j++)
				{
					if(nums[i]+nums[j] == target)
					{
						result.push_back(i);
						result.push_back(j);
						break;
					}

				}
			}
		return result;
	}

}


//哈希表法
class Solution{

public:
	vector<int> twoSum(vector<int>& nums , int target){
		vector<int> result;
		unordered_map<int,int> note;
		UDT_MAP_INT_CSTRING::iterator it;
		int findkey = 0;
		for(int i = 0 ; i < nums.size()-1 ; i++)
		{
			findkey = target - nums[i];
			it = note.find();
			if(it != note.end()){//找到
				result.push_back(i);
				result.push_back(it);
				break;
			}

		}


	}


}
