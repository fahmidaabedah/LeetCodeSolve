public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String[] arr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(s.length() - 1 - i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (!arr[i].equals(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}//TC=O(n)
//SC=O(n)
