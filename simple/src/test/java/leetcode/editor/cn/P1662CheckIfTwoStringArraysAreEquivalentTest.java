package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class P1662CheckIfTwoStringArraysAreEquivalentTest {
    @Test
    public void main() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ac", "b"};
        final boolean res = new P1662CheckIfTwoStringArraysAreEquivalent().new Solution().arrayStringsAreEqual(word1, word2);
        Assert.assertEquals(res, true);
    }
}