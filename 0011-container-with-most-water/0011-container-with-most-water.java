class Solution {
    public int maxArea(int[] height) {

        int maxVol = 0;
        int low = 0;
        int high = height.length - 1;

        while (low < high) {

            int width = high - low;
            int vol;

            if (height[low] < height[high]) {
                vol = height[low] * width;
            } else {
                vol = height[high] * width;
            }

            if (vol > maxVol) {
                maxVol = vol;
            }

            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }

        return maxVol;
    }
}