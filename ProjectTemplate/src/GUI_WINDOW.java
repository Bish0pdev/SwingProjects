import javax.swing.*;

//Basic window class using swing. Does most of the setup for you
public class GUI_WINDOW {
    JFrame window;
    JPanel CenterPanel;//Used to center objects
    //Takes in a window title and size
    public GUI_WINDOW(String WindowTitle,int xdim, int ydim) {
        window = new JFrame();//Instaniate window
        CenterPanel = new JPanel();//Instaniate panel
        window.setTitle(WindowTitle);//Setting the title of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Controls what the program does when you close the window
        window.setVisible(true);//actually allows the window to be seen
        window.setSize(xdim,ydim);//Sets the default size of the window
        window.setResizable(true);//Controls if the user can resize the window
        window.add(CenterPanel); //Adds panel to the frame
    }
    public GUI_WINDOW() {
        window = new JFrame();//Instaniate window
        CenterPanel = new JPanel();//Instaniate panel
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Controls what the program does when you close the window
        window.setVisible(true);//actually allows the window to be seen
        window.setResizable(true);//Controls if the user can resize the window
        window.add(CenterPanel); //Adds panel to the frame
    }
    public GUI_WINDOW(String WindowTitle) {
        window = new JFrame();//Instaniate window
        CenterPanel = new JPanel();//Instaniate panel
        window.setTitle(WindowTitle);//Setting the title of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Controls what the program does when you close the window
        window.setVisible(true);//actually allows the window to be seen
        window.setResizable(true);//Controls if the user can resize the window
        window.add(CenterPanel); //Adds panel to the frame
    }
}
