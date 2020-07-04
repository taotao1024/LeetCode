//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其
// 最后一个单词的长度。如果字符串从左向右滚动显示，那么
// 最后一个单词就是最后出现的单词。
//
// 如果不存在最后一个单词，请返回 0 。 
//
// 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。 
//
// 
//
// 示例: 
//
// 输入: "Hello World"
//输出: 5
// 
// Related Topics 字符串

package leetcode.editor.cn;

import org.w3c.dom.ls.LSException;

/**
 * 最后一个单词的长度
 *
 * @author YY
 */
public class P58LengthOfLastWord {
    public static void main(String[] args) {
        Solution sloution = new P58LengthOfLastWord().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
            /**
             * 返回字符串的副本，忽略前导空白和尾部空白。
             */
            s = s.trim();
            String[] splits = s.split(" ");
            if (splits.length == 0) {
                return 0;
            } else {
                return splits[splits.length - 1].length();
            }
        }

        public int lengthOfLastWord2(String s) {
            int len = s.length(), lastWordLen = 0;
            if (0 == len) {
                return 0;
            } else {
                char[] chars = s.toCharArray();
                for (int i = len - 1; i >= 0; i--) {
                    if (chars[i] != ' ') {
                        lastWordLen++;
                    }
                    if (chars[i] == ' ' && lastWordLen > 0) {
                        break;
                    }
                }
                return lastWordLen;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}