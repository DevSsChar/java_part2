import java.util.Scanner;

public class p3 {
    String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        p3 p = new p3();
        System.out.println(p.reverseString(s));
        scan.close();
    }
}
