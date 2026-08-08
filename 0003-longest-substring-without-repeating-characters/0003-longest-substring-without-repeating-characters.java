import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0) + 1);
            while(map.get(ch)>1){
                char lch=s.charAt(left);
                map.put(lch,map.get(ch)-1);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }

        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna