import java.util.*;
public class randomm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();
        char[] character = sentence.toCharArray();

        Random rand = new Random();


        for(int i = 0; i<character.length; i++){
            if(rand.nextBoolean()){
                character[i] = Character.toUpperCase(character[i]);
            }
        }

        String result = new String(character);

        System.out.println("Result:");
        System.out.println(" ");

        System.out.println(result);

        sc.close();

    }
}