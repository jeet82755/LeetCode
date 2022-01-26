//Problem Name => 2119. A Number After a Double Reversal

//URL => https://leetcode.com/problems/a-number-after-a-double-reversal/

//Solution

class Solution {

    // if num=0 then true		
    //just check [num > 0] has atleast one leading zero

    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        else return (num % 10) == 0? false : true;
    }
}