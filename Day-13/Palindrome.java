public class Palindrome{
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length(); i++) {
            int n = str.length();

            if(str.charAt(i)!=str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));
    }
}