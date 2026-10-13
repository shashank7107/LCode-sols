class Solution {
    public void sortColors(int[] nums) {
        int min = 0;
        int mid = 0;
        int max = nums.length-1;
        while(mid<=max){
            if(nums[mid] == 0){
                int temp = nums[min];
                nums[min] = nums[mid];
                nums[mid] = temp;
                min++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[max];
                nums[max] = nums[mid];
                nums[mid] = temp;
                max--;
            }
        }
    }
}