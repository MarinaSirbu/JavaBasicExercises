public class SwapVariables {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        int temp;

        // swap with temp variable
        temp = a;
        a=b;
        b=temp;
        System.out.println(a + " ; " + b);

        // swap without temp variable
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" ; "+b);

        // swap strings
        String s1 = "United";
        String s2 = "Kingdom";
        s1=s1+s2;
        s2=s1.substring(0,(s1.length()-s2.length()));
        s1=s1.substring(s2.length());
        System.out.println(s1+" ; "+s2);
        
    }
}
