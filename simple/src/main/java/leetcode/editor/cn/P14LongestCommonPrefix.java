//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串

package leetcode.editor.cn;

/**
 * 最长公共前缀
 *
 * @author YY
 */
public class P14LongestCommonPrefix {
    public static void main(String[] args) {
        Solution sloution = new P14LongestCommonPrefix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            // 参数校验
            if (strs.length == 0) {
                return "";
            }
            String result = strs[0];
            // 算法内容
            for (int i = 0; i < strs.length; i++) {
                while (strs[i].indexOf(result) != 0) {
                    result = result.substring(0, result.length() - 1);
                    if (result.length() == 0) {
                        return "";
                    }
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}