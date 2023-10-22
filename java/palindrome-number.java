// QUESTION: Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        char[] num = Integer.toString(x).toCharArray();
        return checkpal(num, 0, num.length-1);
    }

    public boolean checkpal(char[] s, int start, int end){
        if(start >= end){ //base
            return true;
        }

        if(s[start] == s[end]){
            //the palindrome condition
            return checkpal(s, ++start, --end);
        }else{
            return false;
        }
    }   
}
