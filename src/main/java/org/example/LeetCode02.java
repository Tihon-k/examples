package org.example;
    //https://leetcode.com/problems/palindrome-number/
public class LeetCode02 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] xchar = str.toCharArray();
        for (int i = 0; i < xchar.length / 2; i++) {
            if (xchar[i] != xchar[xchar.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
