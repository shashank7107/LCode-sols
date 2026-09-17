import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int originalSize = nums.length;
        int setSize = set.size();

        return setSize != originalSize;
    }
}