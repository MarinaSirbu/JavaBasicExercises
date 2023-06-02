public class String_SearchWord {
    public static void main(String[] args) {
        String s = "Java is awesome";
        String word = "javas";

        if(s.toLowerCase().contains(word)){
            System.out.println("String \""+s+"\" contains word \""+word+"\"");
        } else {
            System.out.println("String \""+s+"\" does NOT contain word \""+word+"\"");
        }
    }
}
