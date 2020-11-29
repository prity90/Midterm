package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
    }
        public static boolean isPalindrome(String a){
            String b="";
            int n = a.length();

            for(int i=n-1; n>0;n--){
                b = b + a.charAt(i);
            }
            if (a.equalsIgnoreCase(b)){
                return true;
            }
            return false;

    }
}
