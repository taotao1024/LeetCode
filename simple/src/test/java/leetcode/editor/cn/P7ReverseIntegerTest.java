package leetcode.editor.cn;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


public class P7ReverseIntegerTest {


    @Test
    public void P7ReverseIntegerTest() {
        int x = -120;
        int result = new P7ReverseInteger().new Solution().reverse(x);
        Assert.assertEquals(result, -21);
    }
}
