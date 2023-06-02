public class String_CheckPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        String reversed = "";

        for(int i = s.length()-1; i >=0; i--){
            reversed=reversed+s.charAt(i);
        }

        if(s.equalsIgnoreCase(reversed)){
            System.out.println(s+" is palindrome");
        } else {
            System.out.println(s+" is NOT palindrome");
        }

    }
}
