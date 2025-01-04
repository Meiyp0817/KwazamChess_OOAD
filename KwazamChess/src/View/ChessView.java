package View;

import View.Dialog.QuitDialog;

import javax.swing.*;
import java.awt.*;

public class ChessView extends JFrame {
    public static final int GUI_width = 500;
    public static final int GUI_height = 800;

    private final ChessBoard board;
    private final ChessMenuBar menubar;
    private final QuitDialog quitDialog;


    public ChessView(){
        board = new ChessBoard();
        menubar = new ChessMenuBar();
        quitDialog = new QuitDialog();
        initView();
    }

    public void initView(){
        setTitle("Kwazam Chess Game");
        setPreferredSize(new Dimension(GUI_width,GUI_height));
        setLayout(new BorderLayout());

        addChessBoard();
        addMenuBar();

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ChessBoard getBoard(){
        return board;
    }

    public ChessMenuBar getMenubar() {
        return menubar;
    }

    public void addChessBoard(){
        add(board,BorderLayout.CENTER);
    }

    public void addMenuBar(){
        setJMenuBar(menubar);
    }


}
