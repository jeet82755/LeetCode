//Problem Name => 58. Length of Last Word

//URL => https://leetcode.com/problems/length-of-last-word/

//Solution

class Solution {
    public int lengthOfLastWord(String s) 
    {
        int count = 0;
        int val = s.length() - 1;
        
        //ignoring leading spaces of the last word
        while(val >= 0 && s.charAt(val) == ' ') 
        {
            val--;
        }
        
        //calculating length of the last word
        while(val >= 0 && s.charAt(val) != ' ') 
        {
            val--;;
            count++;
        }
        
        return count;
    }
}