package leetcode.editor.cn;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P27RemoveElementTest {
    int[] nums = {3, 2, 2, 3};
    int val = 3;

    @Test
    public void main() {
        int result = new P27RemoveElement().new Solution().removeElement(nums, val);
        Assert.assertEquals(result, 2);
    }
}