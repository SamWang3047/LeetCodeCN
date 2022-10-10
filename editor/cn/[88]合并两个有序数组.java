import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (nums2.length == 0) return;
//        if (nums1.length == 1) {
//            nums1[0] = nums2[0];
//            return;
//        }
//        if (nums1[0] == 0) {
//            for (int i = 0; i < n; i++) {
//                nums1[i] = nums2[i];
//            }
//            return;
//        }
//        int[] tempA = new int[m];
//        for (int i = 0; i < m; i++) {
//            tempA[i] = nums1[i];
//        }
//        boolean flag = false;
//
//        int a = 0, b = 0;
//        for (int i = 0; i < m + n; i++) {
//            if (tempA[a] < nums2[b]) {
//                nums1[i] = tempA[a];
//                a++;
//                if (a == m) {
//                    break;
//                }
//            } else {
//                nums1[i] = nums2[b];
//                b++;
//                if (b == n) {
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        if (flag) {
//            for (int i = a; i < m; i++) {
//                nums1[i + n] = tempA[a];
//                a++;
//            }
//        } else {
//            for (int i = b; i < n; i++) {
//                nums1[i + m] = nums2[b];
//                b++;
//            }
//        }
//
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
