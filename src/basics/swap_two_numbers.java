package basics;

public class swap_two_numbers {
    static void main() {
        int a =  5, b = 9;
        int temp;
        System.out.println("a is : " + a + ", "+ "b is : " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("after swap a : " + a);
        System.out.println("after swap b : " + b);
    }
}
