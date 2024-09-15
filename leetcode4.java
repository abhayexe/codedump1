import java.util.*;

public class leetcode4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        String num1 = sc.next();
        String num2 = sc.next();

        int n = 0;
        for (int i = 0; i < num1.length(); i++) {
            n = n * 10 + num1.charAt(i) - '0';
        }
        int m = 0;
        for (int i = 0; i < num2.length(); i++) {
            m = m * 10 + num2.charAt(i) - '0';
        }
        int res = n+m;
        String result = "" +res;
        System.out.println(result);
    }
}
