package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class XandO {
    JFrame window = new JFrame("X and O");
    JButton btnOne = new JButton();
    JButton btnTwo = new JButton();
    JButton btnThree = new JButton();
    JButton btnFour = new JButton();
    JButton btnFive = new JButton();
    JButton btnSix = new JButton();
    JButton btnSeven = new JButton();
    JButton btnEight = new JButton();
    JButton btnNine = new JButton();
    int turn = 1;
    ArrayList<Integer> playerOne = new ArrayList<>();
    ArrayList<Integer> playerTwo = new ArrayList<>();

    void buildUI(){
        window.add(btnOne);
        window.add(btnTwo);
        window.add(btnThree);
        window.add(btnFour);
        window.add(btnFive);
        window.add(btnSix);
        window.add(btnSeven);
        window.add(btnEight);
        window.add(btnNine);

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn ==1){
                    btnOne.setText("X");
                    playerOne.add(1);
                    turn = 2;
                    checkWin();
                }else{
                    btnOne.setText("O");
                    playerTwo.add(1);
                    turn = 1;
                    checkWin();
                }
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn ==1){
                    btnTwo.setText("X");
                    playerOne.add(2);
                    turn = 2;
                    checkWin();
                }else{
                    btnTwo.setText("O");
                    playerTwo.add(2);
                    turn = 1;
                    checkWin();
                }
            }
        });

        window.setSize(400, 400);
        window.setVisible(true);
        window.setLayout(new GridLayout(3, 3));
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    void checkWin(){
        if(playerOne.contains(1) && playerOne.contains(2) && playerOne.contains(3)){
            JOptionPane.showMessageDialog(null, "Player One Wins");
        }
    }

    public static void main(String[] args) {
        XandO xandO = new XandO();
        xandO.buildUI();
    }
}
