public class String_CountNrOccurrenceOfCharacters {
    public static void main(String[] args) {

        int count = countOccurrences("aaanjda", 'a');
        System.out.println(count);
    }

    public static int countOccurrences(String word, char character){
        int count = 0;
        for (int i=0; i < word.length(); i++){
            if(word.charAt(i)==character){
                count++;
            }
        }
        return count;
    }
}
