package basics;

public class largest_among_three_num {
    static void main() {
        int a = 44;
        int b = 22;
        int c= 15;

        if (a >= b && a > c) {
            System.out.println(" a is greater.");
        }else if (b > a && b > c) {
            System.out.println(" b is greater.");
        }else {
            System.out.println(" c is greater.");
        }
    }
}
