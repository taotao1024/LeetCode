package leetcode.editor.cn;

//给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。 
//
// 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。 
//
// 注意: 
//假设字符串的长度不会超过 1010。 
//
// 示例 1: 
//
// 
//输入:
//"abccccdd"
//
//输出:
//7
//
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
// Related Topics 哈希表 
// 👍 250 👎 0

import java.util.HashMap;

public class P409LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new P409LongestPalindrome().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestPalindrome2(String s) {
            int[] count = new int[128];
            int length = s.length();
            for (int i = 0; i < length; ++i) {
                count[s.charAt(i)]++;
            }

            int result = 0;
            for (int v : count) {
                result += v / 2 * 2;
                if (v % 2 == 1 && result % 2 == 0) {
                    result++;
                }
            }
            return result;
        }

        public int longestPalindrome(String s) {
            int res = 0;
            final HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                final char c = s.charAt(i);
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.remove(c);
                    res += 2;
                }
            }
            if (!map.isEmpty()) {
                res++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}