class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[i];
                if(max<sum){
                    max=sum;
                }
            }
        }
        return max;
    }
}