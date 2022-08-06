import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.JPanel;



public class game_panel extends JPanel implements ActionListener{
   static final int Screen_width = 600;
   static final int Screen_height = 600;
   static final int Units_size = 25;
   static final int Game_units = (Screen_width*Screen_height)/Units_size;
   static final int Delay = 75;
   final int x[] = new int[Game_units];
   final int y[] = new int[Game_units];
   int Bodyparts = 5;
   int fruitFinished ;
   int fruitX;
   int fruitY;
   char direction = 'L';
   Boolean running = false;
   Timer timer;
   Random random;
   
    public game_panel(){
        random = new Random();
        this.setPreferredSize(new Dimension(Screen_width,Screen_height));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    public void startGame(){
        newfruit();
        running = true;
        timer = new Timer(Delay,this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){

    }
    public void newfruit(){

    }
    public void move(){

    }
    public void checkfruit(){

    }
    public void checkCollisions(){

    }public void gameover(Graphics g){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
    public static void main(String[] args){
        game_panel obj=new game_panel();
        obj.startGame();
    }

}