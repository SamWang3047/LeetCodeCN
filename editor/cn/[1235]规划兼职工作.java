
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Work[] works = new Work[endTime.length];
        for (int i = 0; i < works.length; i++)
            works[i] = new Work(startTime[i], endTime[i], profit[i]);
        Arrays.sort(works);
        int dp[] = new int[works.length + 1];
        dp[0] = 0; // 初始第一个虚拟的dp，报酬为0
        for (int i = 1; i <= works.length; i++) {
            int pre = 0;
            for (int j = i - 1; j >= 0; j--) {
                // 向前寻找“最近的”“已完成的"兼职工作
                if (works[j].endTime <= works[i-1].startTime) {
                    pre = j + 1; break;
                }
            }
            dp[i] = Math.max(dp[i - 1], dp[pre] + works[i-1].profit);
        }
        return dp[works.length];
    }
    /** 兼职工作实体类 */
    class Work implements Comparable<Work> {
        public int startTime, endTime, profit;
        public Work(int startTime, int endTime, int profit) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
        public int compareTo(Work other) {
            return Integer.compare(this.endTime, other.endTime);
        }
    }
}

//leetcode submit region end(Prohibit modification and deletion)
