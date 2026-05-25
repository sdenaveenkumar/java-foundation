package basics;

import java.util.Scanner;

public class vowel_or_consonants {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter: ");
        char character = Character.toLowerCase(sc.next().charAt(0));


        if(character == 'a'||character == 'e'||character == 'i'|| character == 'o'||character == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
