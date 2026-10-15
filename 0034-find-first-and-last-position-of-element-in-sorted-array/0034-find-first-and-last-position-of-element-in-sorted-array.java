
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    int findFirst(int[] nums, int target) {
        int start = 0;
        int last = nums.length - 1;
        int result = -1;

        while (start <= last) {
            int mid = (start + last) / 2;

            if (nums[mid] == target) {
                result = mid;
                last = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return result;
    }

    int findLast(int[] nums, int target) {
        int start = 0;
        int last = nums.length - 1;
        int result = -1;

        while (start <= last) {
            int mid = (start + last) / 2;

            if (nums[mid] == target) {
                result = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return result;
    }
}
