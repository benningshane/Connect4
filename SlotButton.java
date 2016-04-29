import java.util.*;
import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SlotButton extends JButton{

  private int _col;

  public SlotButton(int col){
    super();
    super.setSize(50,50);

    ActionListener sl = new SlotListerner();

    super.addActionListener(sl);
    _col = col;
  }

  public void disableButton(){
    super.setEnabled(false);
  }

  public void enableButton(){
    super.setEnabled(true);
  }

  class SlotListerner implements ActionListener{

    public void actionPerformed(ActionEvent e){
      if(Connect4.turn.equals("R")){
        Board.pieces[Connect4.level[_col]][_col].paintRed();
        Connect4.turn = "B";
        Connect4.grid[Connect4.level[_col]][_col] = "R";
      } else if(Connect4.turn.equals("B")){
        Board.pieces[Connect4.level[_col]][_col].paintBlack();
        Connect4.turn = "R";
        Connect4.grid[Connect4.level[_col]][_col] = "B";
      }

      Connect4.level[_col]--;
      Connect4.checks();
      }

    }


}
