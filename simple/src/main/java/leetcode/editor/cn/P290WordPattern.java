package leetcode.editor.cn;

//给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。 
//
// 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。 
//
// 示例1: 
//
// 输入: pattern = "abba", str = "dog cat cat dog"
//输出: true 
//
// 示例 2: 
//
// 输入:pattern = "abba", str = "dog cat cat fish"
//输出: false 
//
// 示例 3: 
//
// 输入: pattern = "aaaa", str = "dog cat cat dog"
//输出: false 
//
// 示例 4: 
//
// 输入: pattern = "abba", str = "dog dog dog dog"
//输出: false 
//
// 说明: 
//你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。 
// Related Topics 哈希表 
// 👍 265 👎 0

import java.util.HashMap;

public class P290WordPattern {
    public static void main(String[] args) {
        Solution solution = new P290WordPattern().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            if (s == null || pattern == null) {
                return false;
            }
            final String[] sArray = s.split(" ");
            final String[] patternArray = pattern.split("");
            if (sArray.length != patternArray.length) {
                return false;
            }

            final HashMap<String, String> map = new HashMap<>();
            for (int i = 0; i < patternArray.length; i++) {
                if (map.containsKey(patternArray[i])) {
                    if (!map.get(patternArray[i]).equals(sArray[i])) {
                        return false;
                    }
                } else {
                    if (map.containsValue(sArray[i])) {
                        return false;
                    } else {
                        map.put(patternArray[i], sArray[i]);
                    }
                }
            }
            return true;
        }
        public boolean wordPattern2(String pattern, String s) {

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}