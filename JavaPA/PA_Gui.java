package JavaPA;

import javax.swing.*;

public class PA_Gui {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel currentInfoPanel;
    private JLabel currentTime;

    public static void main (String[] args){
        JFrame frame = new JFrame("JavaPA");
        frame.setContentPane(new PA_Gui().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
