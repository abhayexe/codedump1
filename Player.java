import main.GamePannel;
import main.KeyHandler;
import java.awt.Graphics2D;
import java.awt.Color;

public class Player extends Entity{
    
    GamePannel gp;
    KeyHandler keyH;

    public Player(gamePannel gp, keyHandler keyH){

        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();

    }
    public void setDefaultValues(){

        x=100;
        y=100;
        speed = 4;

    }
    public void update(){
        if(keyH.upPressed == true){
            y -= speed;
        }
        else if(keyH.downPressed == true){
            y += speed;
        }
        else if(keyH.leftPressed == true){
            x -= speed;
        }
        else if(keyH.rightPressed == true){
            x += speed;
        }
    }
    public void draw(Graphics2D g2){
        g2.setColor(Color.CYAN);
        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}