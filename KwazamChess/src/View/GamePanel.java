/*package View;

import Model.*;
import Model.Pieces;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JFrame implements Runnable {
    public static final int width = 500;
    public static final int height = 800;
    final int FPS= 60;
    Thread gamethread;
    ChessBoard board = new ChessBoard();


    public static final int RED = 0;
    public static final int BLUE = 1;
    int currentColor = RED;

    //Pieces
    public static ArrayList<Pieces> pieces = new ArrayList<>();
    public static ArrayList<Pieces> currentpieces = new ArrayList<>();

    public GamePanel() {
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
        setPieces();
        copyPieces(pieces, currentpieces);
        setVisible(true);
    }

    public void launchGame(){
        gamethread = new Thread(this);
        gamethread.start();
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

    public void copyPieces(ArrayList<Pieces> source, ArrayList<Pieces> target){
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    @Override
    public void run() {
        //game loop
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while(gamethread != null){
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime)/drawInterval;
            lastTime = currentTime;

            if(delta >= 1){
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update(){

    }

    public void paintComponent(Graphics g){
        //super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        board.paintComponent(g2d);

        for(Pieces p : pieces){
            p.paintComponent(g2d);
        }

    }

}*/
