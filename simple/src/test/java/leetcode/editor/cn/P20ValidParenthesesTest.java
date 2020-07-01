package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class P20ValidParenthesesTest {

    String s = "()[]{}";

    @Test
    public void main() {
        boolean valid = new P20ValidParentheses().new Solution().isValid(s);
        System.out.println(valid);
    }

    @Test
    public void testStringLength() {
        if ("".length() == 0) {
            System.out.println(true);
        }
    }

    @Test
    public void testMain2() {
        int t = s.length() / 2;
        while (t > 0) {
            s = s.replace("{}", "").replace("()", "").replace("[]", "");
            if (s.length() == 0) {
                Assert.assertTrue(true);
            }
            t--;
        }
        Assert.assertTrue(s.isEmpty());
    }
}