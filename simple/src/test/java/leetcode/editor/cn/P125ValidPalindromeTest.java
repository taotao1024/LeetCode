package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P125ValidPalindromeTest {

    @Test
    public void main() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = new P125ValidPalindrome().new Solution().isPalindrome(s);
        Assert.assertEquals(result, true);
    }

    @Test
    public void main1() {
        String s = "race a car";
        boolean result = new P125ValidPalindrome().new Solution().isPalindrome(s);
        Assert.assertEquals(result, false);
    }

    @Test
    public void main2() {
        String s = "race a car";
        boolean result = new P125ValidPalindrome().new Solution().isPalindrome1(s);
        Assert.assertEquals(result, false);
    }
}