class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> 
            Integer.compare(a[0], b[0])
        );

        ArrayList<int[]> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < intervals.length) {

            // Keep extending j while intervals overlap
            while (j < intervals.length - 1 &&
                   intervals[j + 1][0] <= intervals[j][1]) {

                // Extend the current interval if needed
                intervals[j + 1][1] =
                    Math.max(intervals[j + 1][1], intervals[j][1]);

                j++;
            }

            int[] temp = new int[2];
            temp[0] = intervals[i][0];
            temp[1] = intervals[j][1];

            ans.add(temp);

            i = j + 1;
            j = i;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}