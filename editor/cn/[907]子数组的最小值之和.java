
//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
////    private static final int MOD = 1000000007;
////    public int sumSubarrayMins(int[] arr) {
////        if (arr == null || arr.length == 0) {
////            return 0;
////        }
////        int n = arr.length;
////        long ans = 0;
////        for (int i = 0; i < n; i++) {
////            int min = arr[i];
////            for (int j = i; j < n; j++) {
////                min = Math.min(min, arr[j]);
////                ans += min;
////            }
////            if (ans >= MOD) {
////                ans -= MOD;
////            }
////        }
////        return (int) ans;
////    }
//}
class Solution {
    public int sumSubarrayMins(int[] arr) {
        long result = 0;
        int[] stack = new int[arr.length]; // 使用数组结构模拟堆栈，里面存储arr数组的下标，为了便于计算“管辖区域”的跨度
        int head = 0, tail = head, mod = (int) (1e9 + 7); // 配合模拟堆栈的head指针和tail指针
        for (int i = 0; i <= arr.length; i++) {
            int num = (i == arr.length) ? 0 : arr[i]; // 如果arr数组遍历到最后一个元素，则还需要模拟结尾元素0，为了让stack中元素都出栈
            while (head != tail && arr[stack[tail - 1]] > num) {
                int n = stack[--tail]; // 待计算数字arr[n]的【数组下标】
                int h = (head != tail) ? stack[tail - 1] : -1; // arr[n]的“辐射区域”head头的【数组下标】（开区间）
                int t = i; // arr[n]的“辐射区域”tail尾的【数组下标】（开区间）
                result = (result + (long) (n - h) * (t - n) * arr[n]) % mod;
            }
            stack[tail++] = i;
        }
        return (int) result;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
