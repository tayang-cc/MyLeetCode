//Given a string s consisting of words and spaces, return the length of the 
//last word in the string. 
//
// A word is a maximal substring consisting of non-space characters only. 
//
// 
// Example 1: 
//
// 
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
// 
//
// Example 2: 
//
// 
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.
// 
//
// Example 3: 
//
// 
//Input: s = "luffy is still joyboy"
//Output: 6
//Explanation: The last word is "joyboy" with length 6.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s consists of only English letters and spaces ' '. 
// There will be at least one word in s. 
// 
//
// Related Topics 字符串 👍 603 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int pos = len - 1;
        int res = 0;
        //寻找第一个非空字符Index
        while(pos >= 0 && s.charAt(pos) == ' ')pos--;
        //寻找之后的第一个空字符Index
        if(pos > 0){
            res = pos;
            while(pos >=0 && s.charAt(pos) != ' ') pos--;
            return res - pos;
            }else{
            res = pos + 1;
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
