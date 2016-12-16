import javax.swing.*;
import java.awt.*;

public class Game extends JFrame{
    final private static int SIDE = 100;
    final private static int C = 5;
    JFrame game_window;
    ////JPanel panel;
    //private static JPanel[][] JPanelMatrix= new JPanel[3][3];

    public static void main(String[] args) throws Exception {
        Game gui = new Game();
        gui.setUp();
    }

    public void setUp(){
        game_window=new JFrame();
        ////panel = new JPanel();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(600,300);
        game_window.setSize(310,330);
        game_window.setResizable(false);
        final GameField game_field=new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
        ////panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        ////panel.setLayout(new GridLayout(3,3,5,5));
    }

    private static void onRepaint(Graphics g){
        g.drawRect(100,-5,C,310);
        g.drawRect(205,-5,C,310);
        g.drawRect(-5,100,310,C);
        g.drawRect(-5,205,310,C);
       // for (int i=0; i < 2; i++) {
       //     for (int j=0; j<2; j++) {
                //JPanelMatrix[i][j].setSize(SIDE,SIDE);
                //JPanelMatrix[i][j].setBorder(BorderFactory.createEmptyBorder(i*SIDE,j*SIDE+j*C,(i+1)*SIDE+(i*C),(j+1)*SIDE+(j*C)));
       //     }
       // }
    }

    private static void onRepaint2(Graphics g) {

    }

    private static class GameField extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
           super.paintComponent(g);
            onRepaint(g);
            onRepaint2(g);
            repaint();
        }
    }
}