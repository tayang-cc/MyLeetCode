//English description is not available for the problem. Please switch to 
//Chinese.
// Related Topics 数组 模拟 👍 47 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        int res = 0;
        for (int i = 0; i < operations.length; i++) {
            int temp = gem[operations[i][0]] / 2;
            gem[operations[i][1]] += temp;
            gem[operations[i][0]] -= temp;
        }
        int min = gem[0], max = gem[0];
        for (int i = 1; i < gem.length; i++) {
            if (min > gem[i]) min = gem[i];
            if (max < gem[i]) max = gem[i];
        }

        return max - min;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
