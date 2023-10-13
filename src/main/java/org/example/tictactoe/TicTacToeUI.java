package org.example.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TicTacToeUI {

    ArrayList<Integer> playerOne = new ArrayList<Integer>();
    ArrayList<Integer> playerTwo = new ArrayList<Integer>();
    int count = 1;

    JFrame ticTacFrame;
    JButton btnOne;
    JButton btnTwo;
    JButton btnThree;
    JButton btnFour;
    JButton btnFive;
    JButton btnSix;
    JButton btnSeven;
    JButton btnEight;
    JButton btnNine;

    public void drawUI(){
        ticTacFrame = new JFrame("X and O");
        ticTacFrame.setSize(500, 500);
        ticTacFrame.setLayout(new GridLayout(3, 3));
        ticTacFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        btnOne = new JButton();
        btnTwo = new JButton();
        btnThree = new JButton();
        btnFour = new JButton();
        btnFive = new JButton();
        btnSix = new JButton();
        btnSeven = new JButton();
        btnEight = new JButton();
        btnNine = new JButton();

        ticTacFrame.add(btnOne);
        ticTacFrame.add(btnTwo);
        ticTacFrame.add(btnThree);
        ticTacFrame.add(btnFour);
        ticTacFrame.add(btnFive);
        ticTacFrame.add(btnSix);
        ticTacFrame.add(btnSeven);
        ticTacFrame.add(btnEight);
        ticTacFrame.add(btnNine);

        ticTacFrame.setVisible(true);

        // Handling Button clicks

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(count % 2 == 1){
                    playerOne.add(1);
                    btnOne.setText("X");
                }else {
                    playerTwo.add(1);
                    btnOne.setText("O");
                }
                count += 1;
                System.out.println(count);
                btnOne.setEnabled(false);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(count % 2 == 1){
                    playerOne.add(1);
                    btnTwo.setText("X");
                }else {
                    playerTwo.add(1);
                    btnTwo.setText("O");
                }
                count += 1;
                System.out.println(count);
                btnTwo.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        TicTacToeUI ui = new TicTacToeUI();
        ui.drawUI();
    }

    public void checkWin(){
        if (playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)){
            // TODO display player one wins and reset game
        }else if (playerOne.contains(4) && playerOne.contains(5) && playerOne.contains(6)){

        }else if (playerOne.contains(7) && playerOne.contains(8) && playerOne.contains(9)){

        }else if (playerOne.contains(1) && playerOne.contains(4) && playerOne.contains(7)){

        }else if (playerOne.contains(2) && playerOne.contains(5) && playerOne.contains(8)){

        }else if (playerOne.contains(3) && playerOne.contains(6) && playerOne.contains(9)){

        }else if (playerOne.contains(1) && playerOne.contains(5) && playerOne.contains(9)){

        }else if (playerOne.contains(3) && playerOne.contains(5) && playerOne.contains(7)){

        }
        // TODO Player Two winning Settings

    }

    void reset(){
        count = 1;
        playerOne.clear();
        playerTwo.clear();

        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(true);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(true);
    }
}
