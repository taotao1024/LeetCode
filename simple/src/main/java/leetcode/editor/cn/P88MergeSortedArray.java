//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。 
//
// 
//
// 说明: 
//
// 
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。 
// 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。 
// 
//
// 
//
// 示例: 
//
// 输入:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6] 
// Related Topics 数组 双指针

package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 合并两个有序数组
 *
 * @author YY
 */
public class P88MergeSortedArray {
    public static void main(String[] args) {
        Solution sloution = new P88MergeSortedArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 合并后排序
         *
         * @param nums1
         * @param m
         * @param nums2
         * @param n
         */
        public void merge0(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2, 0, nums1, m, n);
            Arrays.sort(nums1);
        }

        /**
         * 双指针 / 从前往后
         *
         * @param nums1
         * @param m
         * @param nums2
         * @param n
         */
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] nums1_copy = new int[m + n];
            System.arraycopy(nums1, 0, nums1_copy, 0, m);
            int p = 0, p1 = 0, p2 = 0;
            while ((p1 < m) && (p2 < n)) {
                nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];
            }
            if (p1 < m) {
                System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
            }
            if (p2 < n) {
                System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
            }

        }

        /**
         * 双指针 / 从后往前
         *
         * @param nums1
         * @param m
         * @param nums2
         * @param n
         */
        public void merge3(int[] nums1, int m, int[] nums2, int n) {
            // two get pointers for nums1 and nums2
            int p1 = m - 1;
            int p2 = n - 1;
            // set pointer for nums1
            int p = m + n - 1;

            // while there are still elements to compare
            while ((p1 >= 0) && (p2 >= 0))
            // compare two elements from nums1 and nums2
            // and add the largest one in nums1
            {
                nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
            }

            // add missing elements from nums2
            System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}