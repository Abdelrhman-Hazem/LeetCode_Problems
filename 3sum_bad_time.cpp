class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> singleResult(3);
        int size=nums.size();
        //int* ind[10001];
        int exist[200001][2]={{0,0}};
        sort(nums.begin(),nums.end());

        for (int i=0;i<size;i++){
            exist[nums[i]+100000][0]++;
            exist[nums[i]+100000][1]=i;
        }

        int temp;
        bool unique;
        for(int i=0;i<size;i++)
            for(int j=i+1;j<size;j++){
                temp = nums[i]+nums[j];
                if(temp>=-100000 && temp<=100000 
                && exist[-1*temp+100000][0]>0 && exist[-1*temp+100000][1] >j){
                    singleResult[0]=nums[i];
                    singleResult[1]=nums[j];
                    singleResult[2]=-1*temp;
                    unique = true;
                    for(int k=0;k<result.size();k++)
                        if(result[k][0]==singleResult[0] 
                        && result[k][1]==singleResult[1])
                            unique = false;
                            
                    if(unique)result.push_back(singleResult);
                    //break;
                }
            }
        return result;
    }
};
