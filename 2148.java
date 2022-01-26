//Problem Name => 2148. Count Elements With Strictly Smaller and Greater Elements

//URL => https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/

//Solution

class Solution {
    public int countElements(int[] nums) {
        
        //initialise all variables
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int minCount = 0;
        int maxCount = 1;
        
        //Iterate Array only once
        for (int i = 0; i < nums.length; ++i) {
            
            // count number of minimums in array
            if (nums[i] < minVal) {
                minVal = nums[i];
                minCount = 1;
            } else if (nums[i] == minVal) {
                ++minCount;
            }
            
            //count number of maximums in araay
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxCount = 1;
            } else if (nums[i] == maxVal) {
                ++maxCount;
            }
        }
        
        //final output 
        //check min value is equal to max value -> 0 
        //else remove count all minimum & maximum values from length of an array
        return (minVal == maxVal) ? 0 : nums.length - minCount - maxCount;   
    }
}