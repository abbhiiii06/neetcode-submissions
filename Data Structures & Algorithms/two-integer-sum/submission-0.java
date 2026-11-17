class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i=0;
       int j=i+1;
       while(i<nums.length){
        if(j!=nums.length){
            int sum=nums[i]+nums[j];
            if(sum==target){
                return new int[]{i,j};
            }else{
                j++;
            }
        }else{
            i++;
            j=i+1;
        }
       }
       return new int[]{};
    }

}
