class Solution {
  /*
  荷兰三色旗问题解
  */
  public void sortColors(int[] nums) {
      int head,rear,curr;
      head=0;
      rear=nums.length-1;
      curr=0;
      while(head<rear){
          if(nums[curr]==0){
              int temp=nums[head];
              nums[head]=nums[curr];
              nums[curr]=temp;
              curr++;
              head++;
          }
          else{
              if(nums[curr]==2){
                  int temp=nums[curr];
                  nums[curr]=nums[rear];
                  nums[rear]=temp;
                  curr++;
                  rear--;
              }
              else{
                  curr++;
              }
          }
      }
  }
}