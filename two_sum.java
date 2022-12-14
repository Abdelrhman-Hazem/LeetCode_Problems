class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        int size=nums.length;
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
}
