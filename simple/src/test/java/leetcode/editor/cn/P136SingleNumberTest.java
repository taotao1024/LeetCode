package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P136SingleNumberTest {

    @Test
    public void main() {
        int[] num = {2, 2, 1};
        int result = new P136SingleNumber().new Solution().singleNumber(num);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void main1() {
        int[] num = {4, 1, 4, 2, 1};
        int result = new P136SingleNumber().new Solution().singleNumber(num);
        Assert.assertEquals(result, 2);
    }@Test
    public void main2() {
        int[] num = {4, 1, 4, 3, 1};
        int result = new P136SingleNumber().new Solution().singleNumber(num);
        Assert.assertEquals(result, 3);
    }
}