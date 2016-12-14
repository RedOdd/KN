import javax.swing.*;
import java.awt.*;

public class Game extends JFrame{
    private static int HIGHT=100;
    private static int c=5;

    public static void main(String[] args) throws Exception {
        Game gui = new Game();
        gui.setUp();
    }

    public void setUp(){
        JFrame game_window=new JFrame();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(600,300);
        game_window.setSize(310,333);
        game_window.setResizable(false);
        final GameField game_field=new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
    }

    private static void onRepaint(Graphics g){
        g.drawRect(100,-5,c,310);
        g.drawRect(205,-5,c,310);
        g.drawRect(-5,100,310,c);
        g.drawRect(-5,205,310,c);
    }

    private static class GameField extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            onRepaint(g);
            repaint();
        }
    }
}