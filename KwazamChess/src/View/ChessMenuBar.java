package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessMenuBar extends JMenuBar {
    private final JMenu GameMenu;
    private final JMenuItem QuitMenuItem;

    public ChessMenuBar() {

        // Create the "Game" menu
        GameMenu = new JMenu("Game");
        // Add "Quit Game" menu item
        QuitMenuItem = new JMenuItem("Quit Game");

        GameMenu.add(QuitMenuItem);
        // Add the "Game" menu to the menu bar
        this.add(GameMenu);
    }

    public JMenuItem getQuitMenuItem(){
        return QuitMenuItem;
    }
}
