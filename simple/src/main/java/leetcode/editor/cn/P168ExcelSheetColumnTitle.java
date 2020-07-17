//给定一个正整数，返回它在 Excel 表中相对应的列名称。 
//
// 例如， 
//
//     1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB 
//    ...
// 
//
// 示例 1: 
//
// 输入: 1
//输出: "A"
// 
//
// 示例 2: 
//
// 输入: 28
//输出: "AB"
// 
//
// 示例 3: 
//
// 输入: 701
//输出: "ZY"
// 
// Related Topics 数学

package leetcode.editor.cn;

/**
 * Excel表列名称
 *
 * @author YY
 */
public class P168ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution sloution = new P168ExcelSheetColumnTitle().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convertToTitle(int n) {
            StringBuilder stringBuilder = new StringBuilder();
            while (n != 0) {
                n--;//这里稍作处理，因为它是从1开始
                stringBuilder.append((char) (n % 26 + 'A'));
                n /= 26;
            }
            return stringBuilder.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}

