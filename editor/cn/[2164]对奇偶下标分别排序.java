
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        //小根堆，非递减
        PriorityQueue<Integer> even = new PriorityQueue<>();
        //大根堆，非递增
        PriorityQueue<Integer> odd = new PriorityQueue<>((a, b)->{return b - a;});

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) even.offer(nums[i]);
            else odd.offer(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) nums[i] = even.poll();
            else nums[i] = odd.poll();
        }

        return nums;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
