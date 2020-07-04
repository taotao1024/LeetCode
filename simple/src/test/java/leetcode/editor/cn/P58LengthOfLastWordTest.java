package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P58LengthOfLastWordTest {

    @Test
    public void main() {
        String s = "Today is a nice day ";
        int result = new P58LengthOfLastWord().new Solution().lengthOfLastWord(s);
        Assert.assertEquals(result, 3);
    }
}