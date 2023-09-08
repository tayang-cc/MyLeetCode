//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lowercase English letters. 
// 
//
// Related Topics 字典树 字符串 👍 2826 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //test case : ["flower","flow","flight"]
        int min = strs[0].length();
        int index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
                index = i;
            }
        }
        String str1 = "";
        for (int i = min; i > 0; i--) {
            str1 = strs[index].substring(0, i);
            int a = 0;
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(str1)) break;
                else a++;
            }
            if (a == strs.length) return str1;
        }
        return "";
    }
}

//leetcode submit region end(Prohibit modification and deletion)
