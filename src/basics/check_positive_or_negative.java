package basics;

public class check_positive_or_negative {
 public static void main(String[] args) {
        int num = -5;
        if (num < 0) {
            System.out.println(num + " is negative number");
        }else if (num > 0) {
            System.out.println(num+ " is positive number");
        }else {
            System.out.println("Number is 0");
        }
    }
}
