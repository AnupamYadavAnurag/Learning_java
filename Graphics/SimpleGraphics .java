import java.awt.*;
import javax.swing.*;

public class SimpleGraphics extends JFrame {
    public SimpleGraphics() {
        setTitle("Graphics Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello Anupam!", 150, 100);
        g.setColor(Color.RED);
        g.drawRect(100, 120, 200, 100);
        g.setColor(Color.BLUE);
        g.fillOval(150, 150, 80, 80);
    }

    public static void main(String[] args) {
        new SimpleGraphics();
    }
}
