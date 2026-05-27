package basics;

import org.w3c.dom.ls.LSOutput;

public class remove_whitespace_from_string {
    static void main() {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }



}
