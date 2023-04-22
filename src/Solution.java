import java.util.Arrays;

class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                ans += count[i];
            }
        }

        return ans;
    }
}