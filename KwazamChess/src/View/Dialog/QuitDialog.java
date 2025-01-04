package View.Dialog;

import javax.swing.*;

public class QuitDialog {
    public boolean showDialog(JFrame parentFrame) {
        int comfirm = JOptionPane.showConfirmDialog(
                parentFrame,
                "Are you sure you want to quit",
                "Quit Game",
                JOptionPane.YES_NO_OPTION);

        return comfirm == JOptionPane.YES_NO_OPTION;
    }
}