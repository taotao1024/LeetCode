package leetcode.editor.cn;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;


@RunWith(JUnit4.class)
public class P1TwoSumTest {
    @Test
    public void P1TwoSumTest() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
