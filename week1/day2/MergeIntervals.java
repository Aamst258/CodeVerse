
import java.util.ArrayList;
import java.util.Arrays;

// leetcode problem number   56
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int[] prev = intervals[0];
        // added the first subarray of the intervals array
        int n = intervals.length;
        for (int i = 1; i < n; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
                // handles all cases ;
            } else {
                res.add(prev);
                prev = interval;
            }

        }
        res.add(prev);
        return res.toArray(new int[res.size()][]);
    }
}
