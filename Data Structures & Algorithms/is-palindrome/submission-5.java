class Solution {
    public boolean isPalindrome(String s) {
                int left = 0;
                        int right = s.length() - 1;

                                while (left < right) {
                                            // Skip non-alphanumeric from the left
                                                        if (!Character.isLetterOrDigit(s.charAt(left))) {
                                                                        left++;
                                                                                    } 
                                                                                                // Skip non-alphanumeric from the right
                                                                                                            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                                                                                                                            right--;
                                                                                                                                        } 
                                                                                                                                                    // Both are alphanumeric, so compare them
                                                                                                                                                                else {
                                                                                                                                                                                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    left++;
                                                                                                                                                                                                                                                    right--;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                return true;
    }
}
