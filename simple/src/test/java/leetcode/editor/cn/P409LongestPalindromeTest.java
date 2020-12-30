package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P409LongestPalindromeTest {
    @Test
    public void main() {
        int result = new P409LongestPalindrome().new Solution().longestPalindrome("abccccdd");
        System.out.println(result);
    }
}