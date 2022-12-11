class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result(2);
        int size=nums.size();
        //int* ind[10001];
        for(int i=0;i<size;i++)
            for(int j=i+1;j<size;j++)
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
        return result;
    }
};
