package Model;

import View.*;

public class Tor extends Pieces{
    public Tor(int color, int col, int row){
        super(color, col, row);

        if(color == ChessModel.RED){
            image = getImage("/pieces/r-Torpiece");
        }else{
            image = getImage("/pieces/b-Torpiece");
        }
    }
}
