package Model;

import View.*;

public class Sau extends Pieces{
    public Sau(int color, int col, int row) {
        super(color, col, row);

        if (color == ChessModel.RED) {
            image = getImage("/pieces/r-Saupiece");
        } else {
            image = getImage("/pieces/b-Saupiece");
        }
    }
}
