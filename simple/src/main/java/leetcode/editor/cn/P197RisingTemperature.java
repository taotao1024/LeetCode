//给定一个 Weather 表，编写一个 SQL 查询，来查找与之前（昨天的）日期相比温度更高的所有日期的 Id。 
//
// +---------+------------------+------------------+
//| Id(INT) | RecordDate(DATE) | Temperature(INT) |
//+---------+------------------+------------------+
//|       1 |       2015-01-01 |               10 |
//|       2 |       2015-01-02 |               25 |
//|       3 |       2015-01-03 |               20 |
//|       4 |       2015-01-04 |               30 |
//+---------+------------------+------------------+ 
//
// 例如，根据上述给定的 Weather 表格，返回如下 Id: 
//
// +----+
//| Id |
//+----+
//|  2 |
//|  4 |
//+----+ 
//

package leetcode.editor.cn;

/**
 * 上升的温度
 *
 * @author YY
 */
public class P197RisingTemperature {
    public static void main(String[] args) {
        Solution sloution = new P197RisingTemperature().new Solution();
    }

    //There is no code of Java type for this problem

    class Solution {
        /**
         *  select a.Id from  Weather as a
         *  inner join Weather as b
         *                                       日期差
         *  on a.Temperature > b.Temperature and dateDiff(a.RecordDate,b.RecordDate) = 1
         */
    }
}