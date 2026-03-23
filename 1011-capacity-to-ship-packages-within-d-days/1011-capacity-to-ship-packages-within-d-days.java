import java.util.*;

class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0, high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int daysUsed = 1;
            int load = 0;

            for (int w : weights) {
                if (load + w > mid) {
                    daysUsed++;
                    load = w;
                } else {
                    load += w;
                }
            }

            if (daysUsed <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}