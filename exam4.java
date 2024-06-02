class pen{
    //variables or data like int, string etc..
    String color;
    String type;

    //methods or functions
    public void printColor(){
        System.out.println("The color is : "+this.color);
    }

    public void printType(){
        System.out.println("the type is : "+this.type);
    }
    //non parametirised constructor
    pen(){
        System.out.println("Constructor is called");
    }

}
//public class
public class exam4{
    public static void main(String args[]){
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen pen2 = new pen();
        pen2.color = "Black";
        pen2.type = "Ball";

        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();
    }
}