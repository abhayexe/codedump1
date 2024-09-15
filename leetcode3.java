import java.util.*;
public class leetcode3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter left and right numbers: ");
        int left = sc.nextInt();
        int right = sc.nextInt();
        int count=0;

        for(int i = left; i<=right; i++){
            int r = 0;
            int res = 0;
            while(i>0){
                r = i%2;
                res+=r;
                i/=2;
            }
            if(res ==2 || res == 3|| res == 5 || res == 7){
                count++;
            }
        }
        System.out.println(count);
    }
}
