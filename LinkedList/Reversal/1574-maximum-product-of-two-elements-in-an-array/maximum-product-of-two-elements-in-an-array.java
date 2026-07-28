class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int max= 0;
        int secondMax = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        int ans = (max - 1) * (secondMax - 1);
        return ans;
    }
}