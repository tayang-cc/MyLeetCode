//Given two strings needle and haystack, return the index of the first 
//occurrence of needle in haystack, or -1 if needle is not part of haystack. 
//
// 
// Example 1: 
//
// 
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
// 
//
// Example 2: 
//
// 
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
// 
//
// 
// Constraints: 
//
// 
// 1 <= haystack.length, needle.length <= 10⁴ 
// haystack and needle consist of only lowercase English characters. 
// 
//
// Related Topics 双指针 字符串 字符串匹配 👍 2000 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();

        if (len1 < len2) return -1;
        if (len1 == len2) return haystack.equals(needle) ? 0 : -1;

        if (haystack.contains(needle)) {
            char c = needle.charAt(0);
            for (int i = 0; i < len1 - len2 + 1; i++) {
                if (haystack.charAt(i) == c) {
                    if (haystack.substring(i, i + len2).equals(needle)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
