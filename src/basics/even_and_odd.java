package basics;

import java.util.Scanner;

public class even_and_odd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // checking even or odd

        System.out.println("You have entered : " + num);

        // test edge case first, then apply logic
        if (num < 0) {
            System.out.println("Enter a number greater than 0.");
        }else if(num % 2 == 0) {
            System.out.println(num + " is even.");
        }else {
            System.out.println(num + " is odd.");
        }
    }
}
