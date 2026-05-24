package basics;

import java.util.Scanner;

public class basics {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.nextLine();
        System.out.println("What is your profession: ");
        String profession = sc.nextLine();
        System.out.println("Hello " + name + "!" + "You are a " + profession +".");

    }
}
