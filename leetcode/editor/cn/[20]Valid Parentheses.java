//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
//', determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// Every close bracket has a corresponding open bracket of the same type. 
// 
//
// 
// Example 1: 
//
// 
//Input: s = "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: s = "(]"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s consists of parentheses only '()[]{}'. 
// 
//
// Related Topics 栈 字符串 👍 4006 👎 0


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        if(s.length() % 2 == 1) {
            return false;
        }else {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.empty()) {
                        return false;
                    }
                    char top = (char) stack.pop();
                    if (ch == ')' && top != '(') {
                        return false;
                    }
                    if (ch == ']' && top != '[') {
                        return false;
                    }
                    if (ch == '}' && top != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
