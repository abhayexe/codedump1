import java.util.*;
public class exam2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Decimal : "+n);

        int bin[] = new int[1000];
        int i = 0;
        while(n>0){
            bin[i] = n%2;
            n = n/2;
            i++;
        }
        int j;
        System.out.print("Binary : ");
        for(j=i-1; j>=0; j--){
            System.out.print(bin[j]);
        }
    }
}