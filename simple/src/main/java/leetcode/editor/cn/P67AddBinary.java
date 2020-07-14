//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 数学 字符串

package leetcode.editor.cn;

/**
 * 二进制求和
 *
 * @author YY
 */
public class P67AddBinary {
    public static void main(String[] args) {
        Solution sloution = new P67AddBinary().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder ans = new StringBuilder();
            int ca = 0; //是否进一位
            for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
                int sum = ca;
                sum += (i >= 0 ? a.charAt(i) - '0' : 0); // 获取字符串a对应的某一位的值 当i<0是 sum+=0（向前补0） 否则取原值 ‘1’的char类型和‘0’的char类型刚好相差为1
                sum += (j >= 0 ? b.charAt(j) - '0' : 0);// 获取字符串a对应的某一位的值 当i<0是 sum+=0（向前补0） 否则取原值 ‘1’的char类型和‘0’的char类型刚好相差为1
                ans.append(sum % 2);  //如果二者都为1  那么sum%2应该刚好为0 否则为1
                ca = sum / 2;   //如果二者都为1  那么ca 应该刚好为1 否则为0
            }
            ans.append(ca == 1 ? ca : "");// 判断最后一次计算是否有进位  有则在最前面加上1 否则原样输出
            return ans.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}