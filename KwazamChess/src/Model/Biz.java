package Model;

import View.*;

public class Biz extends Pieces{
    public Biz(int color, int col, int row){
        super(color, col, row);

        if(color == ChessModel.RED){
            image = getImage("/pieces/r-Bizpiece");
        }else{
            image = getImage("/pieces/b-Bizpiece");
        }
    }
}
