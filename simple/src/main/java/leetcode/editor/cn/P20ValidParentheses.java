//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串

package leetcode.editor.cn;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Stack;

/**
 * 有效的括号
 *
 * @author YY
 */
public class P20ValidParentheses {
    public static void main(String[] args) {
        Solution sloution = new P20ValidParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            if (s.length() % 2 != 0) {
                return false;
            }
            // 左括号代表入栈，右括号代表出栈
            Stack<Character> stack = new Stack<Character>();
            for (char c : s.toCharArray()) {
                if ('(' == c) {
                    stack.push(')');
                } else if ('[' == c) {
                    stack.push(']');
                } else if ('{' == c) {
                    stack.push('}');
                } else if (stack.isEmpty() || c != stack.pop()) {
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}