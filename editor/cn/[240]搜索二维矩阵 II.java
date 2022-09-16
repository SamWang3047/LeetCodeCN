//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性： 
//
// 
// 每行的元素从左到右升序排列。 
// 每列的元素从上到下升序排列。 
// 
//
// 
//
// 示例 1： 
// 
// 
//输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21
//,23,26,30]], target = 5
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21
//,23,26,30]], target = 20
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= n, m <= 300 
// -10⁹ <= matrix[i][j] <= 10⁹ 
// 每行的所有元素从左到右升序排列 
// 每列的所有元素从上到下升序排列 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics 数组 二分查找 分治 矩阵 👍 1120 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int column = 0, row = 0;
        //先除去无用列，再去除无用行
        for (; row < matrix.length; row++) {
            //找到第j列，target < matrix[0][j] ;
            for (; column < matrix[0].length; column++) {
                if (target == matrix[row][column]) return true;
                //找到第j列;
                if (target < matrix[row][column]){
                    break;
                }
            }
            //随后找到第i行
            for (row = row + 1; row < matrix.length; row++) {
                //如果第i行的第一个元素大于target，即为false
                if (target < matrix[row][0]) {
                    return false;
                }
                for (int i = 0; i < column; i++) {
                    if (target == matrix[row][i]) return true;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
