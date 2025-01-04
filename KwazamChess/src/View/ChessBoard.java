package View;

import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JPanel {
    int cols = 5;//5x 100 =50
    int rows = 8; //8x100 =800
    public static final int squareSize = 100;//small boxes size is 100x100
    public static final int halfSquareSize = squareSize / 2;//used in mouse to move ur pieces in 100x100 boxes



    public ChessBoard() {
        this.setPreferredSize(new Dimension(cols * squareSize, rows * squareSize));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.GREEN);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                g2d.setColor((i + j) % 2 == 0 ? new Color(227, 198, 181) : new Color(157, 105, 53));
                g2d.fillRect(j * squareSize, i * squareSize, squareSize, squareSize);
            }
        }
    }




}
