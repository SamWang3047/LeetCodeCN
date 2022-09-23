
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if (sum == target){
                return new int[] {left, right};
            }
            else if (sum < target){
                left++;
            }
            else if (sum > target){
                right--;
            }
        }
        return new int[] {-1, -1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
