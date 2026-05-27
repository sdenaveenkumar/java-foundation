package basics;

public class frequency_of_char_in_String {
    static void main() {
        String sentence = "This website is awesome";
        char ch = 'e';
        int frequency = 0;
//        System.out.println(sentence.length());
        for (int i = 0; i<sentence.length(); i++) {
            if (ch == sentence.charAt(i)) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
