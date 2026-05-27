package basics;

public class string_empty_or_null {
    static void main() {
        String str = "";
        if (str == null) {
            System.out.println("null");
        } else if (str.isEmpty()) {
            System.out.println("empty");
        }else{
            System.out.println("neither NULL or Empty");
        }
    }
}
