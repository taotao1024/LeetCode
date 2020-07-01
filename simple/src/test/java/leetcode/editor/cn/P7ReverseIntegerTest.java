package leetcode.editor.cn;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class P7ReverseIntegerTest {


    @Test
    public void P7ReverseIntegerTest() {
        int x = -120;
        long result = 0;//这里的数据定义成long型常量，不然在网站上无法执行
        long t = x;
        while (t != 0) {
            result = 10 * result + (t % 10);
            t = t / 10;
        }
        System.out.println(result);
    }
}
