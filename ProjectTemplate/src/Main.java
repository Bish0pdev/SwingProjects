import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GUI_WINDOW window = new GUI_WINDOW("THIS IS A TEMPLATE WINDOW", 250,250);//One of the ways to use the GUI_WINDOW class

        JLabel label = new JLabel();//Make a label
        label.setText("STARTING POINT"); //Actually set the text of the label
        window.CenterPanel.add(label);//Add that label to the windows center panel

    }
}