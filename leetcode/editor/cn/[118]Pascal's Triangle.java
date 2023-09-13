//Given an integer numRows, return the first numRows of Pascal's triangle. 
//
// In Pascal's triangle, each number is the sum of the two numbers directly 
//above it as shown: 
// 
// 
// Example 1: 
// Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
// Example 2: 
// Input: numRows = 1
//Output: [[1]]
// 
// 
// Constraints: 
//
// 
// 1 <= numRows <= 30 
// 
//
// Related Topics 数组 动态规划 👍 1056 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // 递归
        // 1. 递归终止条件
        if (numRows == 1) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            list.add(1);
            res.add(list);
            return res;
        }
        // 2. 递归过程
        List<List<Integer>> res = generate(numRows - 1);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < numRows - 1; i++) {
            list.add(res.get(numRows - 2).get(i - 1) + res.get(numRows - 2).get(i));
        }
        list.add(1);
        res.add(list);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
