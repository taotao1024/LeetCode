package leetcode.editor.cn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class P13RomanToIntegerTest {

    @Test
    public void tests() {
        String s = "MCMXCIV";
        int res = new P13RomanToInteger().new Solution().romanToInt(s);
        System.out.println(res);
    }
}