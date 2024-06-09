import java.util.*;
public class jokecalc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number 1:");
        int a = sc.nextInt();

        System.out.println("Enter the number 2: ");
        int b = sc.nextInt();

        System.out.println("Chose the operation you want to perform: ");
        System.out.println("1 for +, 2 for -, 3 for *, 4 for /, 5 for exit");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            System.out.println("sum is: "+(a+b));
            break;
            case 2:
            System.out.println("difference is: "+(a-b));
            break;
            case 3:
            System.out.println("Multiply is: "+(a*b));
            break;
            case 4:
            System.out.println("division is: "+(a/b));
            break;
            case 5:
            break;
            default:
            System.out.println("Invalid input");
        }
    }
}