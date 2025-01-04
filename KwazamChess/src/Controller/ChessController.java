package Controller;

import Model.*;
import View.*;

public class ChessController {
    private ChessModel model;
    private ChessView view;

    public ChessController(ChessModel model, ChessView view){
        this.view = view;
        this.model = model;
    }


}
