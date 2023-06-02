public class String_CountWords {
    public static void main(String[] args) {
        String s = "We should avoid using plastic as it causes damage to the nature";
        String[] words = s.split(" ");
        int countWords = words.length;

        System.out.println(countWords);
    }
}
