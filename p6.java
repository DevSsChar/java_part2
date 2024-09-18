import java.util.Scanner;
import java.util.*;
public class p6 {
    public static Boolean Anagrams(String s,String s1)
    {
        if(s1.length()!=s.length())
        {
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s1.length();i++)
        {
            if(map.get(s1.charAt(i))!=1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String s1=scan.nextLine();
        System.out.println(Anagrams(s,s1));
        scan.close();
    }
}
