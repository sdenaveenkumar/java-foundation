package basics;

import java.util.Scanner;

public class askUser_print_integer {
    static void main() {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You have entered: " + num);
    }
}
