//doi mau nen thanh mau xanh duong dam
//doi mau vien thanh mau den
package tetris;

import javax.swing.JFrame;

public class WindowGame {
    public static final int WIDTH = 600, HEIGHT = 650 ;

    private Board board;
     private Board hardBoard;
     
    
    private Title title;
    private JFrame window;

    public WindowGame() {

        window = new JFrame("TETRIS");//set name for app
        window.setSize(WIDTH, HEIGHT);//set the size of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set the close button
        window.setLocationRelativeTo(null);//set location 
        window.setResizable(false);//unchangeable size

        
        title = new Title(this);

        
        window.addKeyListener(title);

        window.add(title);

        window.setVisible(true);
        
       
    }

    public void startTetrisNormal() {
        
        board = new Board(20,10);
        window.addKeyListener(board);
        window.remove(title);
        window.addMouseMotionListener(board);
        window.addMouseListener(board);
        window.add(board);
        board.startGameNormal();
        window.revalidate();
    }
    
    public void startTetrisHard() {
        
        hardBoard = new Board(20,15);
        window.addKeyListener(hardBoard);
        
        window.remove(title);
        window.addMouseMotionListener(hardBoard);
        window.addMouseListener(hardBoard);
        window.add(hardBoard);
        hardBoard.startGameNormal();
        window.revalidate();
    }

    public static void main(String[] args) {
        new WindowGame();
    }

}
