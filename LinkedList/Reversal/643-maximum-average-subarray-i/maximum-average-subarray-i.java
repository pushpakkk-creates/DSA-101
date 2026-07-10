class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
             sum += nums[i];
        }

        int maxSum = sum;
        int windowStart = 0;
        int windowEnd = k-1;
        while(windowEnd < nums.length-1){
            sum -= nums[windowStart];
            windowStart++;

            windowEnd++;
            sum += nums[windowEnd];
            

            maxSum = Math.max(sum , maxSum);
        }

        double avg = (double) maxSum/k;
        return avg;
    }
}