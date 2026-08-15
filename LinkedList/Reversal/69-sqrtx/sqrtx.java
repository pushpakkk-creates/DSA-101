class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;

        int left = 0;
        int right = x/2;

        while(left <= right){
            long mid = left + (right-left)/2;
            long square = mid * mid;

            if(square == x) return (int) mid;

            if(square < x) left = (int)mid + 1;
            else right = (int) mid - 1;

        }
        return (int) right;
    }
}