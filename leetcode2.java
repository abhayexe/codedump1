import java.util.Scanner;

public class leetcode2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        char[] dig = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int r;
        String s = "";

        while (n > 0) {
            r = n % 16;
            s = dig[r] + s;
            n = n / 16;
        }
        
        System.out.println("Hexadecimal representation: " + s);
        sc.close();
    }
}
