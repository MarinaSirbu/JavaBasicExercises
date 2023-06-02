public class String_Reverse {
    public static void main(String[] args) {
        String s = "string";
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
           reversed = reversed+s.charAt(i);
        }

        System.out.println(reversed);

    }
}
