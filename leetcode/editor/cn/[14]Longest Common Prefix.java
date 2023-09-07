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
        //["flower","flow","flight"]
        String res = "";
        if (strs.length == 0) return "";

        for(int i=0; i<strs[0].length(); i++){
            for(int j=0; j< strs.length; j++){
                if(strs[j] == "") return "";
                char cur = strs[0].charAt(i);
                if(strs[j].length() <= i) return res;
                if(strs[j].charAt(i) != cur){
                    return res;
                }
                if(j == strs.length - 1){
                    res += cur;
                }
            }

        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
