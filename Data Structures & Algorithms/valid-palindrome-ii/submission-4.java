class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Walk left and right inward as long as characters match.
        // Loop stops early (via return) the moment a mismatch is found.
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                // Mismatch found: try skipping the left char, or skipping the right char.
                // If EITHER resulting range is a palindrome, one deletion suffices.
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }  else {
                // This pair matches; shrink the window and keep checking inward.
                left++;
                right--;
            }
            
        }
        
        // Loop finished without ever finding a mismatch —
        // every pair matched, so s was already a palindrome (0 deletions needed).
        return isPalindrome(s, left, right);
    }

    // Checks whether s[left..right] reads the same forward and backward,
    // with no deletions allowed.
    private boolean isPalindrome(String s, int left, int right){

        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
                
            } else {
                return false;
            }
        }
        return true;
    }
}