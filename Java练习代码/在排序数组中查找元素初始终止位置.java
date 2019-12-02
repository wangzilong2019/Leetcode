class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                a[1]=i;
                break;
            }
        }
        return a;
        
    }
}