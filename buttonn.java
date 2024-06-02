import java.awt.*;
class buttonn extends Frame{
    buttonn(){
        Frame f = new Frame();
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        Button b1 = new Button("SUBMIT");
        f.add(b1);
        b1.setBackground(Color.GREEN);
        b1.setBounds(30, 30, 100, 100);

        //List l1 = new List(10);
        //l1.setBounds(100, 100, 75, 75);

    }
    public static void main(String args[]){
        buttonn obj = new buttonn();
    }
}