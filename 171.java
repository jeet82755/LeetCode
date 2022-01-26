//Problem Name => 171. Excel Sheet Column Number

//URL => https://leetcode.com/problems/excel-sheet-column-number/submissions/

//Solution

class Solution {
    public int titleToNumber(String columnTitle) {
        
        //string to array conversion
        char columnTitleArray[] = columnTitle.toCharArray();
        
        //original logic
        int sum = 0;
        for (int i=0; i < columnTitleArray.length ; ++i) {
            sum *= 26;
            sum += columnTitleArray[i]-'A'+1;
        }
        return sum;
    }
}