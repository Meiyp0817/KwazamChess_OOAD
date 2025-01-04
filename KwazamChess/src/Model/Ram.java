package Model;

import View.*;

public class Ram extends Pieces{
    public Ram(int color, int col, int row){
        super(color, col, row);

        if(color == ChessModel.RED){
            image = getImage("/pieces/r-Rampiece");
        }else{
            image = getImage("/pieces/b-Rampiece");
        }
    }
}