//编写一个 SQL 查询，获取 Employee 表中第二高的薪水（Salary） 。 
//
// +----+--------+
//| Id | Salary |
//+----+--------+
//| 1  | 100    |
//| 2  | 200    |
//| 3  | 300    |
//+----+--------+
// 
//
// 例如上述 Employee 表，SQL查询应该返回 200 作为第二高的薪水。如果不存在第二高的薪水，那么查询应返回 null。 
//
// +---------------------+
//| SecondHighestSalary |
//+---------------------+
//| 200                 |
//+---------------------+
// 
//

package leetcode.editor.cn;

/**
 * 第二高的薪水
 *
 * @author YY
 */
public class P176SecondHighestSalary {
    public static void main(String[] args) {
        Solution sloution = new P176SecondHighestSalary().new Solution();
    }

    //There is no code of Java type for this problem

    class Solution {
        //                   去重                           排序          降序 跳过第一条向后取一条
        // select (select distinct salary from employee  order by salary desc limit 1,1) as SecondHighestSalary
    }

}