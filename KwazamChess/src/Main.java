import Controller.ChessController;
import Model.ChessModel;
import View.ChessView;

public class Main {
    public static void main(String[] args) {
        //model
        ChessModel model = new ChessModel();
        //view
        ChessView view = new ChessView();
        //controller
        ChessController controller = ChessController.getInstance(model,view);

        controller.startGame();
    }
}
