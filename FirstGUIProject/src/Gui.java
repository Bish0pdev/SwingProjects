import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {

    int count = 0;
    private JLabel label;
    private JPanel panel;
    private JButton button;
    private JFrame frame;
    public Gui() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        button = new JButton("Test Button");
        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(300,300,100,100));
        panel.setLayout(new GridLayout());
        panel.add(label);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TEST APP");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("" + count);
    }

    public static void main(String[] args) {
        new Gui();

    }
}