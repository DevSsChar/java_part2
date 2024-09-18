import java.util.*;
public class p1 {
    public static int fibonacci(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=fibonacci(n);
        System.out.println(m);
        scan.close();
    }
}
