class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentsum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentsum + nums[i] > nums[i]){
                currentsum = currentsum + nums[i];
            }
            else{
                currentsum = nums[i];
            }

            if(currentsum > maxSum){
                maxSum = currentsum;
            }
        }
        return maxSum;
    }
}