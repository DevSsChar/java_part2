import java.util.Scanner;

public class p2 {
    public static int climbingStairs(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return climbingStairs(n-1)+climbingStairs(n-2);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=climbingStairs(n);
        System.out.println(m);
        scan.close();
    }
}
