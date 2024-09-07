import java.util.*;

public class leetcode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("area: ");
        int area = sc.nextInt();

        int width = (int) Math.sqrt(area);
        System.out.println("width: "+width);
        while(area % width != 0){
            width--;
        }
        System.out.println("width: "+width);

        int length = area/width;

        System.out.println("length: "+length);

    }
}
