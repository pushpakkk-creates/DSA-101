class Solution {
    public int maxProduct(int n) {
        if(n < 10) return n;

        int firstLargest , secondLargest = -1;

        firstLargest = n%10;
        n /= 10;
        while(n > 0){
            int last = n%10;
            if(last >= firstLargest){
                secondLargest = firstLargest;
                firstLargest = last;
            }
            else if (last >= secondLargest){
                secondLargest = last;
            }
            n /= 10;
        }
        return firstLargest * secondLargest;
    }
}