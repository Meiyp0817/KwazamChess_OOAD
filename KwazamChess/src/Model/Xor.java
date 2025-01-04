package Model;

import View.*;

public class Xor extends Pieces{
    public Xor(int color, int col, int row){
        super(color, col, row);

        if(color == ChessModel.RED){
            image = getImage("/pieces/r-Xorpiece");
        }else{
            image = getImage("/pieces/b-Xorpiece");
        }
    }
}