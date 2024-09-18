import java.util.Scanner;

public class p5 {
    public static Boolean powerOfTwo(int n) {
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(powerOfTwo(n));
        scan.close();
    }
}
