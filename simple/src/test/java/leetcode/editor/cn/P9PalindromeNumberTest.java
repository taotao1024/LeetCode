package leetcode.editor.cn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class P9PalindromeNumberTest {
    @Test
    public void isPalindrome1() {
        int x = 2;
        String reverseNumber = new StringBuilder(String.valueOf(x)).reverse().toString();
        System.out.println(reverseNumber.equals(String.valueOf(x)));
    }

    @Test
    public void isPalindrome2() {
        int x = 121;

        int targer = x;
        int result = 0;
        while (targer != 0) {
            result = result * 10 + (targer % 10);
            targer = targer / 10;
        }
        System.out.println(result == x);
    }

}