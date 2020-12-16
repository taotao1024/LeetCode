package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P290WordPatternTest {
    @Test
    public void main() {
        boolean result = new P290WordPattern().new Solution().wordPattern2("abba", "dog cat cat dog");
        Assert.assertEquals(result, true);
    }
}