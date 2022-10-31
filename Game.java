/*
Names: Amber Lai and Ethan Leung
NetID: alai8 and eleung6
Project 3 Tic Tac Toe Game
Due Date: 4/21/22
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game extends JPanel implements MouseListener {

    int xLocation;
    int yLocation;
    static Graphics xGraphic;
    static Graphics oGraphic;
    int row = 0;
    int column = 0;
    static int drawCheck = 0;
    static boolean gameOver = false;
    static int[][] board = new int[3][3];


    public Game() {

        addMouseListener(this);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Tahoma", Font.PLAIN, (int)(.0000477 * TTTGame.height * TTTGame.width))); // sets font size for x and o

        for (int i = 1; i < 3; i++) { //adjusts the size of x and o based on resizing it
            if (board[0][0] == i) { // cell one x and o graphics
                if (i == 1) g.drawString("O", (((int) (.396 * TTTGame.width) - (int)(.188 * TTTGame.width))/2) + ((int)(.188 * TTTGame.width)),
                        ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50)/2) + (int)(.155 * TTTGame.height));
                else if (i == 2) g.drawString("X", (((int) (.396 * TTTGame.width) - (int)(.188 * TTTGame.width))/2) + ((int)(.188 * TTTGame.width)),
                        ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50)/2) + (int)(.155 * TTTGame.height));
            }
            if (board[0][1] == i) { // cell two x and o graphics
                if (i == 1) g.drawString("O", (((int) (.604 * TTTGame.width) - (int) (.396 * TTTGame.width)) / 2 ) + (int) (.396 * TTTGame.width),
                        ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50)/2) + (int)(.155 * TTTGame.height));
                else if (i == 2) g.drawString("X", (((int) (.604 * TTTGame.width) - (int) (.396 * TTTGame.width)) / 2 ) + (int) (.396 * TTTGame.width),
                        ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50)/2) + (int)(.155 * TTTGame.height));
            }
            if (board[0][2] == i) { // cell three x and o graphics
                if (i == 1) g.drawString("O", (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2 ) +(int) (.604 * TTTGame.width),
                        ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50)/2) + (int)(.155 * TTTGame.height));
                else if (i == 2) g.drawString("X", (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2 ) + (int) (.604 * TTTGame.width),
                        ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50)/2) + (int)(.155 * TTTGame.height));
            }
            if (board[1][0] == i) { // cell four x and o graphics
                if (i == 1) g.drawString("O", (((int) (.396 * TTTGame.width) - (int)(.188 * TTTGame.width))/2) + ((int)(.188 * TTTGame.width)),
                        ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height)-50) /2) + (int)(.328 * TTTGame.height));
                else if (i == 2) g.drawString("X", (((int) (.396 * TTTGame.width) - (int)(.188 * TTTGame.width))/2) + ((int)(.188 * TTTGame.width)),
                        ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height)-50) /2) + (int)(.328 * TTTGame.height));
            }
            if (board[1][1] == i) { // cell five x and o graphics
                if (i == 1) g.drawString("O", (((int) (.604 * TTTGame.width) - (int) (.396 * TTTGame.width)) / 2 ) + (int) (.396 * TTTGame.width),
                        ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height)-50) /2) + (int)(.328 * TTTGame.height));
                else if (i == 2) g.drawString("X", (((int) (.604 * TTTGame.width) - (int) (.396 * TTTGame.width)) / 2 ) + (int) (.396 * TTTGame.width),
                        ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height)-50) /2) + (int)(.328 * TTTGame.height));
            }
            if (board[1][2] == i) {  // cell six x and o graphics
                if (i == 1) g.drawString("O", (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2 ) + (int) (.604 * TTTGame.width),
                        ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height)- 50) /2) + (int)(.328 * TTTGame.height));
                else if (i == 2) g.drawString("X", (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2 ) + (int) (.604 * TTTGame.width),
                        ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height)- 50) /2) + (int)(.328 * TTTGame.height));
            }
            if (board[2][0] == i) { // cell seven x and o graphics
                if (i == 1) g.drawString("O", (((int) (.396 * TTTGame.width) - (int)(.188 * TTTGame.width))/2) + ((int)(.188 * TTTGame.width)),
                        (((int)(.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65 )/2) + (int)(.5 * TTTGame.height) - 50);
                else if (i == 2) g.drawString("X", (((int) (.396 * TTTGame.width) - (int)(.188 * TTTGame.width))/2) + ((int)(.188 * TTTGame.width)),
                        (((int)(.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65 )/2) + (int)(.5 * TTTGame.height) - 50);
            }
            if (board[2][1] == i) { // cell eight x and o graphics
                if (i == 1) g.drawString("O", (((int) (.604 * TTTGame.width) - (int) (.396 * TTTGame.width)) / 2 ) + (int) (.396 * TTTGame.width),
                        (((int)(.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65)/2) + (int)(.5 * TTTGame.height) - 50);
                else if (i == 2) g.drawString("X", (((int) (.604 * TTTGame.width) - (int) (.396 * TTTGame.width)) / 2 ) + (int) (.396 * TTTGame.width),
                        (((int)(.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65)/2) + (int)(.5 * TTTGame.height) - 50);
            }
            if (board[2][2] == i) { // cell nine x and o graphics
                if (i == 1) g.drawString("O", (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2 ) +(int) (.604 * TTTGame.width),
                        (((int)(.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65)/2) + (int)(.5 * TTTGame.height) - 50);
                else if (i == 2) g.drawString("X", (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2 ) +(int) (.604 * TTTGame.width),
                        (((int)(.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65)/2) + (int)(.5 * TTTGame.height) - 50);
            }
        }

        if (TTTGame.clearG == true) {//if new game button is pressed repaints graphics
            repaint();
            TTTGame.clearG = false;
        }

        // vertical lines
        g.drawLine((int) (.396 * TTTGame.width), (int) (.155 * TTTGame.height) - 50, (int) (.396 * TTTGame.width), (int) (.672 * TTTGame.height) - 50);
        g.drawLine(((int) (.604 * TTTGame.width)), (int) (.155 * TTTGame.height) - 50, (int) (.604 * TTTGame.width), (int) (.672 * TTTGame.height) - 50);
        // horizontal lines
        g.drawLine((int) (.188 * TTTGame.width), (int) (.328 * TTTGame.height) - 50, (int) (.813 * TTTGame.width), (int) (.328 * TTTGame.height) - 50);
        g.drawLine((int) (.188 * TTTGame.width), (int) (.5 * TTTGame.height) - 50, (int) (.813 * TTTGame.width), (int) (.5 * TTTGame.height) - 50);


    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        xGraphic = getGraphics();
        oGraphic = getGraphics();
        oGraphic.setFont(new Font("Tahoma", Font.PLAIN, (int)(.0000477 * TTTGame.height * TTTGame.width)));
        xGraphic.setFont(new Font("Tahoma", Font.PLAIN, (int)(.0000477 * TTTGame.height * TTTGame.width)));

        try {
            if (gameOver == false) {
                /* sets the location of the cells based on x and y location along with row and column indexes. For the x and y location,
                it finds the difference between the largest and the smallest x and y values divided by 2,
                and then add it to the smallest x/y value to get the middle of the cell */

                if (x < (int) (.396 * TTTGame.width) && x > (int) (.188 * TTTGame.width)
                        && y < ((int) (.328 * TTTGame.height) - 50) && y > (int) (.155 * TTTGame.height) - 50) {
                    row = 0;
                    column = 0;
                    xLocation = (((int) (.396 * TTTGame.width) - (int) (.188 * TTTGame.width)) / 2) + ((int) (.188 * TTTGame.width));
                    yLocation = ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50) / 2) + (int) (.155 * TTTGame.height);


                } else if (x < (int) (.604 * TTTGame.width) && x > (int) (.396 * TTTGame.width)
                        && y < ((int) (.328 * TTTGame.height) - 50) && y > (int) (.155 * TTTGame.height) - 50) {
                    row = 0;
                    column = 1;
                    xLocation = (((int) (.604 * TTTGame.width) -  (int) (.396 * TTTGame.width)) / 2) +  (int) (.396 * TTTGame.width);
                    yLocation = ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50) / 2) + (int) (.155 * TTTGame.height);

                } else if (x < (int) (.813 * TTTGame.width) && x > (int) (.604 * TTTGame.width)
                        && y < ((int) (.328 * TTTGame.height) - 50) && y > (int) (.155 * TTTGame.height) - 50) {
                    row = 0;
                    column = 2;
                    xLocation = (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2) + (int) (.604 * TTTGame.width);
                    yLocation = ((((int) (.328 * TTTGame.height) - 50) - (int) (.155 * TTTGame.height) - 50) / 2) + (int) (.155 * TTTGame.height);

                } else if (x < (int) (.396 * TTTGame.width) && x > (int) (.188 * TTTGame.width)
                        && y < ((int) (.5 * TTTGame.height) - 50) && y > ((int) (.328 * TTTGame.height) - 50)) {
                    row = 1;
                    column = 0;
                    xLocation = (((int) (.396 * TTTGame.width) - (int) (.188 * TTTGame.width)) / 2) + ((int) (.188 * TTTGame.width));
                    yLocation = ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height) - 50) / 2) + (int) (.328 * TTTGame.height);

                } else if (x < (int) (.604 * TTTGame.width) && x > (int) (.396 * TTTGame.width)
                        && y < ((int) (.5 * TTTGame.height) - 50) && y > (int) (.328 * TTTGame.height) - 50) {
                    row = 1;
                    column = 1;
                    xLocation = (((int) (.604 * TTTGame.width) - (int) (.396 * TTTGame.width)) / 2) + (int) (.396 * TTTGame.width);
                    yLocation = ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height) - 50) / 2) + (int) (.328 * TTTGame.height);

                } else if (x < (int) (.813 * TTTGame.width) && x > (int) (.604 * TTTGame.width)
                        && y < ((int) (.5 * TTTGame.height) - 50) && y > (int) (.328 * TTTGame.height) - 50) {
                    row = 1;
                    column = 2;
                    xLocation = (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2) + (int) (.604 * TTTGame.width);
                    yLocation = ((((int) (.5 * TTTGame.height) - 50) - (int) (.328 * TTTGame.height) - 50) / 2) + (int) (.328 * TTTGame.height);

                } else if (x < (int) (.396 * TTTGame.width) && x > (int) (.188 * TTTGame.width)
                        && y < ((int) (.672 * TTTGame.height) - 50) && y > ((int) (.5 * TTTGame.height) - 50)) {
                    row = 2;
                    column = 0;
                    xLocation = (((int) (.396 * TTTGame.width) - (int) (.188 * TTTGame.width)) / 2) + ((int) (.188 * TTTGame.width));
                    ;
                    yLocation = (((int) (.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65) / 2) + (int) (.5 * TTTGame.height) - 50;

                } else if (x < (int) (.604 * TTTGame.width) && x > (int) (.396 * TTTGame.width)
                        && y < ((int) (.672 * TTTGame.height) - 50) && y > ((int) (.5 * TTTGame.height) - 50)) {
                    row = 2;
                    column = 1;
                    xLocation = (((int) (.604 * TTTGame.width) - (int) (.396 * TTTGame.width)) / 2) + (int) (.396 * TTTGame.width);
                    yLocation = (((int) (.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65) / 2) + (int) (.5 * TTTGame.height) - 50;

                } else if (x < (int) (.813 * TTTGame.width) && x > (int) (.604 * TTTGame.width)
                        && y < ((int) (.672 * TTTGame.height) - 50) && y > ((int) (.5 * TTTGame.height) - 50)) {
                    row = 2;
                    column = 2;
                    xLocation = (((int) (.813 * TTTGame.width) - (int) (.604 * TTTGame.width)) / 2) + (int) (.604 * TTTGame.width);
                    yLocation = (((int) (.813 * TTTGame.height) - (int) (.5 * TTTGame.height) - 65) / 2) + (int) (.5 * TTTGame.height) - 50;


                }
                // checking if the array is empty and sets it to 1 or 2 based on the player
                if (board[row][column] == 0) {
                    if (TTTGame.playerNum == 1) { // checks who turn it is and changes the cell array to the player number
                        board[row][column] = 1; // player one turn and they are circle
                        oGraphic.drawString("O", xLocation, yLocation);
                        TTTGame.playerNum = 2; // sets the player turn to player 2
                        TTTGame.playerTurn.setText("P" + TTTGame.playerNum + "'s Turn");
                    } else if (TTTGame.playerNum == 2) { // player one turn and they are x
                        board[row][column] = 2;
                        xGraphic.drawString("X", xLocation, yLocation);
                        TTTGame.playerNum = 1;
                        TTTGame.playerTurn.setText("P" + TTTGame.playerNum + "'s Turn");
                    }
                    drawCheck++;
                    //checks if something in the cell
                } else if (board[row][column] == 1 || board[row][column] == 2) {
                    System.out.println("Incorrect move");
                    return;
                }
                checkWins();
            }
        } catch (ArrayIndexOutOfBoundsException j) {
            System.out.println("Click in the board!");
        }
    }

    public void checkWins() {
        if (gameOver == false) {
            for (row = 0; row < 3; row++) {
                if (board[row][0] == 1 && board[row][1] == 1 && board[row][2] == 1) {
                    System.out.println("Player One Won!");
                    TTTGame.p1Wins++;
                    gameOver = true;
                    drawCheck++;
                } else if (board[row][0] == 2 && board[row][1] == 2 && board[row][2] == 2) {
                    System.out.println("Player Two Won!");
                    TTTGame.p2Wins++;
                    gameOver = true;
                    drawCheck++;
                }
            }
        }

        if (gameOver == false) {
            for (column = 0; column < 3; column++) {
                if (board[0][column] == 1 && board[1][column] == 1 && board[2][column] == 1) {
                    System.out.println("Player One Won!");
                    TTTGame.p1Wins++;
                    gameOver = true;
                    drawCheck++;
                } else if (board[0][column] == 2 && board[1][column] == 2 && board[2][column] == 2) {
                    System.out.println("Player Two Won!");
                    TTTGame.p2Wins++;
                    gameOver = true;
                    drawCheck++;
                }
            }
        }

        if (gameOver == false) {
            for (int i = 1; i < 3; i++) {
                if (board[0][0] == i && board[1][1] == i && board[2][2] == i) {
                    if (i == 1) {
                        System.out.println("Player One Won!");
                        TTTGame.p1Wins++;
                    } else if (i == 2) {
                        System.out.println("Player Two Won!");
                        TTTGame.p2Wins++;
                    }
                    gameOver = true;
                    drawCheck++;

                } else if (board[0][2] == i && board[1][1] == i && board[2][0] == i) {
                    if (i == 1) {
                        System.out.println("Player One Won!");
                        TTTGame.p1Wins++;
                    } else if (i == 2) {
                        System.out.println("Player Two Won!");
                        TTTGame.p2Wins++;
                    }
                    gameOver = true;
                    drawCheck++;
                }
            }
        }

        if (gameOver == false) {
            if (drawCheck == 9) {
                TTTGame.draws++;
                System.out.println("Draw!");
                gameOver = true;
            }
        }

        TTTGame.p1.setText("P1 Wins: " + TTTGame.p1Wins);
        TTTGame.p2.setText("P2 Wins: " + TTTGame.p2Wins);
        TTTGame.drawNum.setText("Draws: " + TTTGame.draws);
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }



}