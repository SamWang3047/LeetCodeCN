//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个
//整数，判断数组中是否含有该整数。 
//
// 
//
// 示例: 
//
// 现有矩阵 matrix 如下： 
//
// 
//[
//  [1,   4,  7, 11, 15],
//  [2,   5,  8, 12, 19],
//  [3,   6,  9, 16, 22],
//  [10, 13, 14, 17, 24],
//  [18, 21, 23, 26, 30]
//]
// 
//
// 给定 target = 5，返回 true。 
//
// 给定 target = 20，返回 false。 
//
// 
//
// 限制： 
//
// 0 <= n <= 1000 
//
// 0 <= m <= 1000 
//
// 
//
// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/ 
//
// Related Topics 数组 二分查找 分治 矩阵 👍 780 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
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
