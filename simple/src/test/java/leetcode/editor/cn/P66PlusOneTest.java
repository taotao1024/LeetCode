package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P66PlusOneTest {

    @Test
    public void main1() {
        int[] s = {1, 2, 3};
        int[] ints = new P66PlusOne().new Solution().plusOne(s);
        Assert.assertArrayEquals(ints, new int[]{1, 2, 4});
    }

    @Test
    public void main2() {
        int[] s = {1, 2, 9};
        int[] ints = new P66PlusOne().new Solution().plusOne(s);
        Assert.assertArrayEquals(ints, new int[]{1, 3, 0});
    }

    @Test
    public void main3() {
        int[] s = {9, 9, 9};
        int[] ints = new P66PlusOne().new Solution().plusOne(s);
        Assert.assertArrayEquals(ints, new int[]{1, 0, 0,0});
    }
}