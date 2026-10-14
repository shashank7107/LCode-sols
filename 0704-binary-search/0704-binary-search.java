class Solution {
    int mid;
    public int search(int[] nums, int target) {
       int start = 0;
       
       int last = nums.length-1;
       while(start <= last){
        mid = (start+last)/2;

        if(target == nums[mid]){
            return mid;
        }
        else if(target < nums[mid]){
            last = mid-1;
        }
        else{
            start = mid+1;
        }
        
       } 
       return -1;
    }
}