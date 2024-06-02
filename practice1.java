import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class practice1{
    public static void main(String args[]){
        final JFrame f1 = new JFrame("Epilepsy");
        //f1.setDefaultCloseOperation(null);
        f1.setBounds(540, 200, 300, 500);
        f1.setLayout(null);
        f1.setVisible(true);

        Timer t1 = new Timer (300, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int red = (int) (Math.random()* 256);
                int green = (int)(Math.random()* 256);
                int blue = (int)(Math.random()* 256);

                Color rgb = new Color (red, green, blue);

                f1.getContentPane().setBackground(rgb);

            }
        });
        t1.start();


        

    }
}