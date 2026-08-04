class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int k=s.length()-1;
        int csum=0,fsum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z'){
                csum++;
                if(s.charAt(i)==s.charAt(k))
                fsum++;
            }
            k--;
        }
        if(csum==fsum) return true;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna