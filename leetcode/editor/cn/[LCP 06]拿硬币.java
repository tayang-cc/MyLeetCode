//English description is not available for the problem. Please switch to 
//Chinese.
// Related Topics 数组 数学 👍 112 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCount(int[] coins) {
      int count = 0;
      for (int coin : coins) {
        if(coin % 2 == 0) {
          count += coin / 2;
        } else {
          count += (coin-1) / 2 + 1;
        }
      }
      return count;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
