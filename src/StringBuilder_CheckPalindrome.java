public class StringBuilder_CheckPalindrome {
    public static void main(String[] args) {
        String s = "madame";
        StringBuilder sb = new StringBuilder(s).reverse();
        String reversed = sb.toString();

        if(s.equalsIgnoreCase(reversed)){
            System.out.println(s+" is palindrome");
        } else {
            System.out.println(s+" is NOT palindrome");
        }

    }
}
