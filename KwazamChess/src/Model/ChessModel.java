package Model;

import View.ChessBoard;

import java.util.ArrayList;

public class ChessModel {

    public boolean running;

    public static final int RED = 0;
    public static final int BLUE = 1;
    int currentColor = RED;

    public static ArrayList<Pieces> pieces = new ArrayList<>();
    public static ArrayList<Pieces> currentpieces = new ArrayList<>();

    public ChessModel(){
        setPieces();
    }

    public void setPieces(){//model
        //
        pieces.add(new Tor(RED,0,0));
        pieces.add(new Biz(RED,1,0));
        pieces.add(new Sau(RED,2,0));
        pieces.add(new Biz(RED,3,0));
        pieces.add(new Xor(RED,4,0));
        pieces.add(new Ram(RED,0,1));
        pieces.add(new Ram(RED,1,1));
        pieces.add(new Ram(RED,2,1));
        pieces.add(new Ram(RED,3,1));
        pieces.add(new Ram(RED,4,1));

        pieces.add(new Tor(BLUE,0,7));
        pieces.add(new Biz(BLUE,1,7));
        pieces.add(new Sau(BLUE,2,7));
        pieces.add(new Biz(BLUE,3,7));
        pieces.add(new Xor(BLUE,4,7));
        pieces.add(new Ram(BLUE,0,6));
        pieces.add(new Ram(BLUE,1,6));
        pieces.add(new Ram(BLUE,2,6));
        pieces.add(new Ram(BLUE,3,6));
        pieces.add(new Ram(BLUE,4,6));
    }

    public boolean isRunning(){
        return running;
    }

    public void initGame(){
        running = true;
        ChessBoard.s
    }
}
