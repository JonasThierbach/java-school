package Learning;

import javax.swing.JOptionPane;

public class BasicInputGUI {
    public static void main(String[] args) {
        String Name = JOptionPane.showInputDialog("Enter your Name");
        JOptionPane.showMessageDialog(null, "Hello, " + Name);

        int Age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        JOptionPane.showMessageDialog(null, "You are " + Age + " ages old.");
    }
}
