// https://leetcode.com/problems/palindrome-number
class Solution {
        int reverse = 0;
    public boolean isPalindrome(int x) {
        if(x > 0) {
            int d = x%10;
            reverse = reverse*10 + d;
            isPalindrome(x/10);
        }
        if(reverse == x)
            return true;
        return false;
    }
}
