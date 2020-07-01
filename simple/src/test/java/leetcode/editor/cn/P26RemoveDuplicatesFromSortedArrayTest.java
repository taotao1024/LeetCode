package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class P26RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void main() {
        int[] i = {1, 1, 2,2,33,3,3,3,3,3,3,3,3,};
        int i1 = new P26RemoveDuplicatesFromSortedArray().new Solution().removeDuplicates(i);
        Assert.assertEquals(i1, 2);

    }

    @Test
    public void main2() {
        int[] i = {0,1, 1, 2};
        new P26RemoveDuplicatesFromSortedArray().new Solution().removeDuplicates2(i);
    }
}