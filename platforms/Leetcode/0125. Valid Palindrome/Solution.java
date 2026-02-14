class Solution {
    private boolean isAlphaNumeric(char ch) {
        
        if(ch >= 'a' && ch <= 'z') {
            return true;
        }

        if(ch >= 'A' && ch <= 'Z') {
            return true;
        }

        if(ch >= '0' && ch <= '9') {
            return true;
        }

        return false;
    }

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int l = 0;
        int r = s.length() - 1;

        while(l < r) {
            char charL = s.charAt(l);
            if(!isAlphaNumeric(charL)) {
                l++;
                continue;
            }

            char charR = s.charAt(r);
            if(!isAlphaNumeric(charR)) {
                r--;
                continue;
            }

            if(charL != charR) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}