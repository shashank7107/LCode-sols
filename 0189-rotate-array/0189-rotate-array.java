class Solution {
    public static void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        //reverse the whole array.
        reverse(nums, 0, n-1);

        //reverse k length.
        reverse(nums, 0, k-1);

        //reverse remaining elements.
        reverse(nums, k, n-1);
    
    System.out.println(nums);    
    }
}