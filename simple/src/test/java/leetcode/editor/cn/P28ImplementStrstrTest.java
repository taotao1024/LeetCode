package leetcode.editor.cn;

import org.junit.Test;

import static org.junit.Assert.*;

public class P28ImplementStrstrTest {
    String haystack = "hello1", needle = "ll";

    @Test
    public void main() {
        int i = new P28ImplementStrstr().new Solution().strStr(haystack, needle);
        System.out.println(i);
    }

    @Test
    public void main2() {
        int i = new P28ImplementStrstr().new Solution().strStr2(haystack, needle);
        System.out.println(i);
    }

    @Test
    public void main3() {
        int i = new P28ImplementStrstr().new Solution().strStr3(haystack, needle);
        System.out.println(i);
    }
}