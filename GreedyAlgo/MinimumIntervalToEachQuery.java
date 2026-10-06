package GreedyAlgo;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumIntervalToEachQuery {

    public int[] minInterval(int[][] intervals, int[] queries) {

        // Store original indices of queries
        int[] queryIndices = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            queryIndices[i] = i;
        }

        // Sort intervals by starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Sort query indices according to query values
        Integer[] sortedIndices = new Integer[queries.length];

        for (int i = 0; i < queries.length; i++) {
            sortedIndices[i] = i;
        }

        Arrays.sort(sortedIndices, (a, b) -> Integer.compare(queries[a], queries[b]));

        // Min-heap based on interval size
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(
                        a[1] - a[0],
                        b[1] - b[0]
                )
        );

        int[] result = new int[queries.length];
        int index = 0;

        for (int k = 0; k < sortedIndices.length; k++) {

            int queryIndex = sortedIndices[k];
            int query = queries[queryIndex];

            // Add all intervals that have started
            while (index < intervals.length &&
                    intervals[index][0] <= query) {

                pq.offer(intervals[index]);
                index++;
            }

            // Remove intervals that have already ended
            while (!pq.isEmpty() && pq.peek()[1] < query) {
                pq.poll();
            }

            // Smallest valid interval
            if (pq.isEmpty()) {
                result[queryIndex] = -1;
            } else {
                int[] smallestInterval = pq.peek();
                result[queryIndex] =
                        smallestInterval[1] - smallestInterval[0] + 1;
            }
        }

        return result;
    }
}