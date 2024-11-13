import javax.swing.*;
import java.awt.*;

public class JFrameTwo {
    protected JFrame frame;

    public JFrameTwo() {
        initialize();
    }
    public void initialize(){
        frame = new JFrame();
        this.frame.setTitle("Bora Bahea Minha Porra");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(800,500);
        this.frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.BLACK);

        Button button = new Button("Button");
        panel.add(button);

        Button button3 = new Button("Button");
        panel.add(button3);

        Button button2 = new Button("Button");
        panel.add(button2);

        frame.add(panel, BorderLayout.CENTER);
        this.frame.setVisible(true);
    }
}
