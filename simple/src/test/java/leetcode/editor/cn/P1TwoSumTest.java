package leetcode.editor.cn;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;


@RunWith(JUnit4.class)
public class P1TwoSumTest {
    @Test
    public void P1TwoSumTest() {
        int[] nums = {2, 7, 11, 15};
        int[] result = new P1TwoSum().new Solution().twoSum(nums, 9);
        Assert.assertArrayEquals(result, new int[]{0, 1});
    }

}
