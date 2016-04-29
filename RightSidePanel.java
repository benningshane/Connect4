import java.util.*;
import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class RightSidePanel extends JPanel{

  public static JLabel turnLabel;
  public static JButton resetButton;

  public RightSidePanel(){
    super();
    turnLabel = new JLabel("Red's Turn!");
    super.add(turnLabel);
    resetButton = new JButton("Reset Game");

    ActionListener rl = new ResetListener();
    resetButton.addActionListener(rl);

    super.add(resetButton);
  }

  class ResetListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      for(int i = 0; i < 6; i++){
        for(int j = 0; j < 7; j++){
          Connect4.grid[i][j] = "E";
          Board.pieces[i][j].paintYellow();
        }
      }

      for(int j = 0; j < 7; j++){
        Connect4.level[j] = 5;
        Board.sbutton[j].enableButton();
      }

      Connect4.turn = "R";
      Connect4.gameOver = false;
      RightSidePanel.turnLabel.setText("Red's Turn!");
    }
  }

}
