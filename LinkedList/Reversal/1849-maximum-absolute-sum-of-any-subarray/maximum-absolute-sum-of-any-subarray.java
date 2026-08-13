class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int currPSum = 0;
        int currNSum = 0;

        // Positive sum
        for(int num : nums){
            currPSum += num;
            maxSum = Math.max(maxSum , currPSum);

            if(currPSum < 0){
                currPSum = 0;
            }
        

            // Negative sum
            currNSum += num;
            minSum = Math.min(minSum , currNSum);
            if(currNSum > 0){
                currNSum = 0;
            }
        }

        return Math.max(maxSum , Math.abs(minSum));
    }
}