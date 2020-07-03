package leetcode.editor.cn;

import org.junit.Test;

import static org.junit.Assert.*;

public class P35SearchInsertPositionTest {

    @Test
    public void main() {
        int[] nums = {1, 3, 5, 6};
        int val = 7;
        new P35SearchInsertPosition().new Solution().searchInsert(nums, val);
    }
}