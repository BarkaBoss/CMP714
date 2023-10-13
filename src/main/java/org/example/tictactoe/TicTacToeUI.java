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

    public void drawUi(){
        ticTacFrame = new JFrame("X and O");
        ticTacFrame.setSize(500, 500);
        ticTacFrame.setLayout(new GridLayout(3, 3));


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
                }else {
                    playerTwo.add(1);
                }
                count += 1;
                System.out.println(count);
            }
        });
    }

    public static void main(String[] args) {
        TicTacToeUI ui = new TicTacToeUI();
        ui.drawUi();
    }

    public void checkWin(){

    }
}
