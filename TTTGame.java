/*
Names: Amber Lai and Ethan Leung
NetID: alai8 and eleung6
Project 3 Tic Tac Toe Game
Due Date: 4/21/22
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TTTGame extends JPanel implements ActionListener, ComponentListener {

    JPanel menu = new JPanel();
    Game game = new Game();
    JPanel stats = new JPanel();
    JButton newGame = new JButton("New Game");

    static int playerNum = 1;
    static int p1Wins = 0;
    static int p2Wins = 0;
    static int draws = 0;
    static JLabel playerTurn = new JLabel("P"+ playerNum + "'s Turn");
    static JLabel p1 = new JLabel("P1 Wins: " + p1Wins);
    static JLabel p2 = new JLabel("P2 Wins: " + p2Wins);
    static JLabel drawNum = new JLabel("Draws: " + draws);
    static int width;
    static int height;
    static boolean clearG = false;

    public TTTGame() {
        isFocusable();

        // sets JFrame operations and dimensions
        JFrame jf = new JFrame();
        jf.getContentPane().setLayout(new BorderLayout());
        jf.pack();
        jf.setPreferredSize(new Dimension(480,580));
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().add(menu, BorderLayout.PAGE_START);
        jf.getContentPane().add(game, BorderLayout.CENTER);
        jf.addComponentListener(this);
        menu.setPreferredSize(new Dimension(480, 100));
        game.setSize(new Dimension(width,  height - 100));

        // sets up menu panel
        newGame.addActionListener(this);
        menu.add(newGame);
        menu.add(playerTurn);
        stats.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        playerTurn.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        newGame.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        stats.setLayout(new BoxLayout(stats, BoxLayout.Y_AXIS));
        stats.add(p1);
        stats.add(p2);
        stats.add(drawNum);
        menu.add(stats);
        jf.pack();

    }




    // by clicking the new game button it resets the game and randomly selects which player goes first
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            for (int i = 0; i < Game.board.length; i++) {
                for (int j = 0; j < Game.board[i].length; j++) {
                    Game.board[i][j] = 0; // fills the array with 0 which means it is empty
                    Random rand = new Random();
                    game.update(Game.oGraphic);
                    game.update(Game.xGraphic);
                    clearG = true;
                    Game.gameOver = false;
                    Game.drawCheck = 0;
                    playerNum = rand.nextInt(2) + 1;
                    playerTurn.setText("P" + playerNum + "'s Turn");
                }
            }


        } catch (NullPointerException ex) {
            System.out.println("The game board is already empty!");
        }
    }


    @Override
    public void componentResized(ComponentEvent e) {
        Dimension newSize = e.getComponent().getSize();
        width = (int) newSize.getWidth();
        height = (int) newSize.getHeight();
        game.repaint();

    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }


    public static void main(String[] args) {
        TTTGame screen = new TTTGame();


    }

}

