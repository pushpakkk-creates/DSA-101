class Solution {
    public int minimumPushes(String word) {
        int [] freq = new int[26];

        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);
        int ans = 0;  // Variable to hold the total number of pushes
        int idx = 0;  // Index to track the position in the sorted array

        for(int i = 25; i>=0; i--){
            if(freq[i] == 0) break;

            ans += freq[i]*((idx / 8) + 1);
            idx++; 
        }
        return ans;
    }
}