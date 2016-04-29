import java.util.*;
import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel{

  private final int GRIDSPACE = 3;
  public static Piece[][] pieces = new Piece[6][7];
  public static SlotButton[] sbutton = new SlotButton[7];

  public Board(){
    super();


    super.setLayout(new GridLayout(7,7,GRIDSPACE, GRIDSPACE));

    for(int j = 0; j < 7; j++){
      sbutton[j] = new SlotButton(j);
      super.add(sbutton[j]);
    }

    for(int i = 0; i < 6; i++){
      for(int j = 0; j < 7; j++){
        pieces[i][j] = new Piece();
        super.add(pieces[i][j]);
      }
    }

  }

}
