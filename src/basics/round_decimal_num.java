package basics;

public class round_decimal_num {
    static void main() {
        double num = 12.9918;
        double num2 = 12.99189756;
        System.out.printf("%.2f%n", num);
        System.out.format("%.4f%n", num2);

        System.out.printf("%.2f\n",num);
        System.out.format("%.4f\n",num2);

        System.out.printf("%.2f%n%.4f%n", num, num2);
    }
}
