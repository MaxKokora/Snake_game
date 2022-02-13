package game;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {

    private final int SIZE =  320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int [ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;



    public GameField(){
        setBackground(Color.BLACK);
        loadImage();
    }

    public void loadImage(){
        ImageIcon iaa = new ImageIcon("apple.jpg");
        apple = iaa.getImage();
        ImageIcon iid = new ImageIcon("dot.jpg");
        dot = iid.getImage();


    }
}
