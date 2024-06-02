import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import main.Player;

public class GamePannel extends JPanel implements Runnable{
    final int originalTilesize = 16;
    final int scale = 3;

    public final int tileSize = originalTilesize*scale;
    final int maxCol = 16;
    final int maxRow = 12;
    final int screenWidth = tileSize*maxCol;
    final int screenHeight = tileSize*maxRow;

    int FPS = 60;

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    Player player = new Player(this,keyH);

    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;


    public GamePannel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    // public void run(){

    //     double drawInterval = 1000000000/FPS;//nanoseconds 0.01666.. seconds
    //     double nextDrawTime = System.nanoTime() + drawInterval;

    //     while(gameThread != null){
            
    //         update();

    //         repaint();

    //         try{
    //             double remainingTime = nextDrawTime - System.nanoTime();
    //             remainingTime = remainingTime/1000000;

    //             if(remainingTime < 0){
    //                 remainingTime = 0;
    //             }
    //             Thread.sleep((long) remainingTime);
                
    //             nextDrawTime += drawInterval;

    //         }
    //         catch(InterruptedException e){

    //             e.printStackTrace();

    //         }

    //     }
    // }
    public void run(){
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while(gameThread != null){

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime)/drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1){
                update();
                repaint();
                delta--;
                drawCount++;
            }

            if(timer >= 1000000000){
                System.out.println("FPS: "+drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }


    public void update(){

        // if(keyH.upPressed == true){
        //     playerY -= playerSpeed;
        // }
        // else if(keyH.downPressed == true){
        //     playerY += playerSpeed;
        // }
        // else if(keyH.leftPressed == true){
        //     playerX -= playerSpeed;
        // }
        // else if(keyH.rightPressed == true){
        //     playerX += playerSpeed;
        // }
        player.update();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        // g2.setColor(Color.CYAN);
        // g2.fillRect(playerX, playerY, tileSize, tileSize);
        player.draw(g2);
        g2.dispose();
    }
    
}
