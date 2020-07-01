//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学

package leetcode.editor.cn;

/**
 * 整数反转
 *
 * @author YY
 */
public class P7ReverseInteger {
    public static void main(String[] args) {
        Solution sloution = new P7ReverseInteger().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            long result = 0;//这里的数据定义成long型常量，不然在网站上无法执行
            long t = x;
            while (t != 0) {
                result = 10 * result + (t % 10);
                t = t / 10;
            }
            //如果大于或者小于临界值那么返回0
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
                return 0;
            }
            return (int) result;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}