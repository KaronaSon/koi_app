package Components;

import javax.swing.JOptionPane;

public class AlertMessager {
    static public void success(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    static public void warning(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.WARNING_MESSAGE);
    }
    static public void error(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.ERROR_MESSAGE);
    }
}
