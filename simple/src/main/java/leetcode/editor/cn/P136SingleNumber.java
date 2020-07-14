//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 哈希表

package leetcode.editor.cn;

import java.util.Arrays;

/**
 * 只出现一次的数字
 *
 * @author YY
 */
public class P136SingleNumber {
    public static void main(String[] args) {
        Solution sloution = new P136SingleNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 位运算
         *
         * @param nums
         * @return
         */
        public int singleNumber0(int[] nums) {
            int single = 0;
            for (int num : nums) {
                single ^= num;
            }
            return single;
        }

        public int singleNumber(int[] nums) {
            int length = nums.length;
            if (length == 1) {
                return nums[0];
            }
            Arrays.sort(nums);
            // 去头
            if (nums[0] != nums[1]) {
                return nums[0];
            }
            // 去尾
            if (nums[length - 1] != nums[length - 2]) {
                return nums[length - 1];
            }
            for (int i = 1, lg = nums.length - 1; i < lg; i++) {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}