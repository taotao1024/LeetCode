package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class P9PalindromeNumberTest {
    @Test
    public void isPalindrome1() {
        int x = 2;
        boolean result = new P9PalindromeNumber().new Solution().isPalindrome(x);
        Assert.assertTrue(result);
    }

    @Test
    public void isPalindrome2() {
        int x = 121;
        boolean result = new P9PalindromeNumber().new Solution().isPalindrome(x);
        Assert.assertTrue(result);
    }

}