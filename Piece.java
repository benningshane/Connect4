import java.util.*;
import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Piece extends JPanel{

  public Piece(){
    super();

    super.setSize(50,50);

    super.setBackground(Connect4.YELLOW);

  }

  public void paintYellow(){
    super.setBackground(Connect4.YELLOW);
  }
  public void paintRed(){
    super.setBackground(Connect4.RED);
  }
  public void paintBlack(){
    super.setBackground(Connect4.BLACK);
  }


}
