package leetcode.editor.cn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class P13RomanToIntegerTest {

    @Test
    public void tests() {
        String s = "MCMXCIV";
        int n = s.length();
        if (n == 0) {
            System.out.println(s);
        }
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            res += map.get(c);
            if (i > 0 && map.get(c) > map.get(arr[i - 1])) {
                res -= 2 * map.get(arr[i - 1]);
            }
        }
        System.out.println(res);
    }
}