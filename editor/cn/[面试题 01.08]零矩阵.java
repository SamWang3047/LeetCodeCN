import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        //ArrayList记录0的位置
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i+=2) {
                //a记录每个行的0位置，b记录每个列0位置
                int a = list.get(i);
                int b = list.get(i + 1);
                //行清空
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[a][j] = 0;
                }
                //列清空
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][b] = 0;
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
