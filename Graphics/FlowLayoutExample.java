import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout Example");
        f.setLayout(new FlowLayout());

        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.add(new Button("Button 3"));
        f.add(new Button("Button 4"));
        f.add(new Button("Button 5"));

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
