import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycleApplet extends Applet {
    // Initialization method
    public void init() {
        System.out.println("Applet initialized");
    }

    // Start method
    public void start() {
        System.out.println("Applet started");
    }

    // Stop method
    public void stop() {
        System.out.println("Applet stopped");
    }

    // Destroy method
    public void destroy() {
        System.out.println("Applet destroyed");
    }

    // Paint method to draw something on the screen
    public void paint(Graphics g) {
        g.drawString("Applet Life Cycle", 20, 20);
    }
}
