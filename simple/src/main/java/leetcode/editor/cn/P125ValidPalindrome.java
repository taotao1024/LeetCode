//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串

package leetcode.editor.cn;

/**
 * 验证回文串
 *
 * @author YY
 */
public class P125ValidPalindrome {
    public static void main(String[] args) {
        Solution sloution = new P125ValidPalindrome().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        /**
         * 筛选+判断
         *
         * @param s 字符串
         * @return
         */
        public boolean isPalindrome(String s) {
            StringBuffer sgood = new StringBuffer();
            int length = s.length();
            // 过滤大小写、数子
            for (int i = 0; i < length; i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    sgood.append(Character.toLowerCase(ch));
                }
            }
            // 翻转字符串
            StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
            System.out.println(sgood_rev);
            // 求翻转后与翻转前是否相等
            return sgood.toString().equals(sgood_rev.toString());
        }

        /**
         * 双指针
         *
         * @param s 字符串
         * @return
         */
        public boolean isPalindrome1(String s) {
            StringBuffer sgood = new StringBuffer();
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    sgood.append(Character.toLowerCase(ch));
                }
            }
            int n = sgood.length();
            int left = 0, right = n - 1;
            while (left < right) {
                if (Character.toLowerCase(sgood.charAt(left)) != Character.toLowerCase(sgood.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}