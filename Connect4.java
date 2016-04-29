import java.util.*;
import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Connect4 extends JFrame{

  private static final int GRIDSPACE = 3;
  private static final int HEIGHT = 600;
  private static final int WIDTH = 800;


  public static String[][] grid = new String[6][7];
  public static String turn;
  public static boolean gameOver;

  public static Board board;
  public static RightSidePanel rightPanel;

  public static int[] level = new int[7];


  public static Color YELLOW = new Color(255,255,0);
  public static Color BLACK = new Color(0,0,0);
  public static Color RED = new Color(255,0,0);
  public static Color WHITE = new Color(255,255,255);



  public Connect4(){
    super("Connect4!");


    for(int i = 0; i < 6; i++){
      for(int j = 0; j < 7; j++){
        grid[i][j] = "E";
      }
    }

    for(int j = 0; j < 7; j++){
      level[j] = 5;
    }

    turn = "R";
    gameOver = false;

    super.setSize(WIDTH, HEIGHT);

    super.setResizable(false);


    super.setLayout(new GridLayout(1,2,GRIDSPACE,GRIDSPACE));



    board = new Board();
    rightPanel = new RightSidePanel();

    super.add(board);
    super.add(rightPanel);

    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    super.setVisible(true);
  }


  public static void checks(){
    for(int i = 0; i < 7; i++){
      if(level[i] == -1){
        Board.sbutton[i].disableButton();
      }
    }

    if ((grid[0][0].equals("R"))&(grid[0][1].equals("R"))&(grid[0][2].equals("R"))&(grid[0][3].equals("R"))){
      gameOver = true;
    } else if ((grid[0][1].equals("R"))&(grid[0][2].equals("R"))&(grid[0][3].equals("R"))&(grid[0][4].equals("R"))){
      gameOver = true;
    } else if ((grid[0][2].equals("R"))&(grid[0][3].equals("R"))&(grid[0][4].equals("R"))&(grid[0][5].equals("R"))){
      gameOver = true;
    } else if ((grid[0][3].equals("R"))&(grid[0][4].equals("R"))&(grid[0][5].equals("R"))&(grid[0][6].equals("R"))){
      gameOver = true;
    } else if ((grid[1][0].equals("R"))&(grid[1][1].equals("R"))&(grid[1][2].equals("R"))&(grid[1][3].equals("R"))){
      gameOver = true;
    } else if ((grid[1][1].equals("R"))&(grid[1][2].equals("R"))&(grid[1][3].equals("R"))&(grid[1][4].equals("R"))){
      gameOver = true;
    } else if ((grid[1][2].equals("R"))&(grid[1][3].equals("R"))&(grid[1][4].equals("R"))&(grid[1][5].equals("R"))){
      gameOver = true;
    } else if ((grid[1][3].equals("R"))&(grid[1][4].equals("R"))&(grid[1][5].equals("R"))&(grid[1][6].equals("R"))){
      gameOver = true;
    } else if ((grid[2][0].equals("R"))&(grid[2][1].equals("R"))&(grid[2][2].equals("R"))&(grid[2][3].equals("R"))){
      gameOver = true;
    } else if ((grid[2][1].equals("R"))&(grid[2][2].equals("R"))&(grid[2][3].equals("R"))&(grid[2][4].equals("R"))){
      gameOver = true;
    } else if ((grid[2][2].equals("R"))&(grid[2][3].equals("R"))&(grid[2][4].equals("R"))&(grid[2][5].equals("R"))){
      gameOver = true;
    } else if ((grid[2][3].equals("R"))&(grid[2][4].equals("R"))&(grid[2][5].equals("R"))&(grid[2][6].equals("R"))){
      gameOver = true;
    } else if ((grid[3][0].equals("R"))&(grid[3][1].equals("R"))&(grid[3][2].equals("R"))&(grid[3][3].equals("R"))){
      gameOver = true;
    } else if ((grid[3][1].equals("R"))&(grid[3][2].equals("R"))&(grid[3][3].equals("R"))&(grid[3][4].equals("R"))){
      gameOver = true;
    } else if ((grid[3][2].equals("R"))&(grid[3][3].equals("R"))&(grid[3][4].equals("R"))&(grid[3][5].equals("R"))){
      gameOver = true;
    } else if ((grid[3][3].equals("R"))&(grid[3][4].equals("R"))&(grid[3][5].equals("R"))&(grid[3][6].equals("R"))){
      gameOver = true;
    } else if ((grid[4][0].equals("R"))&(grid[4][1].equals("R"))&(grid[4][2].equals("R"))&(grid[4][3].equals("R"))){
      gameOver = true;
    } else if ((grid[4][1].equals("R"))&(grid[4][2].equals("R"))&(grid[4][3].equals("R"))&(grid[4][4].equals("R"))){
      gameOver = true;
    } else if ((grid[4][2].equals("R"))&(grid[4][3].equals("R"))&(grid[4][4].equals("R"))&(grid[4][5].equals("R"))){
      gameOver = true;
    } else if ((grid[4][3].equals("R"))&(grid[4][4].equals("R"))&(grid[4][5].equals("R"))&(grid[4][6].equals("R"))){
      gameOver = true;
    } else if ((grid[5][0].equals("R"))&(grid[5][1].equals("R"))&(grid[5][2].equals("R"))&(grid[5][3].equals("R"))){
      gameOver = true;
    } else if ((grid[5][1].equals("R"))&(grid[5][2].equals("R"))&(grid[5][3].equals("R"))&(grid[5][4].equals("R"))){
      gameOver = true;
    } else if ((grid[5][2].equals("R"))&(grid[5][3].equals("R"))&(grid[5][4].equals("R"))&(grid[5][5].equals("R"))){
      gameOver = true;
    } else if ((grid[5][3].equals("R"))&(grid[5][4].equals("R"))&(grid[5][5].equals("R"))&(grid[5][6].equals("R"))){
      gameOver = true;
    }



      else if ((grid[0][0].equals("R"))&(grid[1][0].equals("R"))&(grid[2][0].equals("R"))&(grid[3][0].equals("R"))){
      gameOver = true;
    } else if ((grid[1][0].equals("R"))&(grid[2][0].equals("R"))&(grid[3][0].equals("R"))&(grid[4][0].equals("R"))){
      gameOver = true;
    } else if ((grid[2][0].equals("R"))&(grid[3][0].equals("R"))&(grid[4][0].equals("R"))&(grid[5][0].equals("R"))){
      gameOver = true;
    } else if ((grid[0][1].equals("R"))&(grid[1][1].equals("R"))&(grid[2][1].equals("R"))&(grid[3][1].equals("R"))){
      gameOver = true;
    } else if ((grid[1][1].equals("R"))&(grid[2][1].equals("R"))&(grid[3][1].equals("R"))&(grid[4][1].equals("R"))){
      gameOver = true;
    } else if ((grid[2][1].equals("R"))&(grid[3][1].equals("R"))&(grid[4][1].equals("R"))&(grid[5][1].equals("R"))){
      gameOver = true;
    } else if ((grid[0][2].equals("R"))&(grid[1][2].equals("R"))&(grid[2][2].equals("R"))&(grid[3][2].equals("R"))){
      gameOver = true;
    } else if ((grid[1][2].equals("R"))&(grid[2][2].equals("R"))&(grid[3][2].equals("R"))&(grid[4][2].equals("R"))){
      gameOver = true;
    } else if ((grid[2][2].equals("R"))&(grid[3][2].equals("R"))&(grid[4][2].equals("R"))&(grid[5][2].equals("R"))){
      gameOver = true;
    } else if ((grid[0][3].equals("R"))&(grid[1][3].equals("R"))&(grid[2][3].equals("R"))&(grid[3][3].equals("R"))){
      gameOver = true;
    } else if ((grid[1][3].equals("R"))&(grid[2][3].equals("R"))&(grid[3][3].equals("R"))&(grid[4][3].equals("R"))){
      gameOver = true;
    } else if ((grid[2][3].equals("R"))&(grid[3][3].equals("R"))&(grid[4][3].equals("R"))&(grid[5][3].equals("R"))){
      gameOver = true;
    } else if ((grid[0][4].equals("R"))&(grid[1][4].equals("R"))&(grid[2][4].equals("R"))&(grid[3][4].equals("R"))){
      gameOver = true;
    } else if ((grid[1][4].equals("R"))&(grid[2][4].equals("R"))&(grid[3][4].equals("R"))&(grid[4][4].equals("R"))){
      gameOver = true;
    } else if ((grid[2][4].equals("R"))&(grid[3][4].equals("R"))&(grid[4][4].equals("R"))&(grid[5][4].equals("R"))){
      gameOver = true;
    } else if ((grid[0][5].equals("R"))&(grid[1][5].equals("R"))&(grid[2][5].equals("R"))&(grid[3][5].equals("R"))){
      gameOver = true;
    } else if ((grid[1][5].equals("R"))&(grid[2][5].equals("R"))&(grid[3][5].equals("R"))&(grid[4][5].equals("R"))){
      gameOver = true;
    } else if ((grid[2][5].equals("R"))&(grid[3][5].equals("R"))&(grid[4][5].equals("R"))&(grid[5][5].equals("R"))){
      gameOver = true;
    } else if ((grid[0][6].equals("R"))&(grid[1][6].equals("R"))&(grid[2][6].equals("R"))&(grid[3][6].equals("R"))){
      gameOver = true;
    } else if ((grid[1][6].equals("R"))&(grid[2][6].equals("R"))&(grid[3][6].equals("R"))&(grid[4][6].equals("R"))){
      gameOver = true;
    } else if ((grid[2][6].equals("R"))&(grid[3][6].equals("R"))&(grid[4][6].equals("R"))&(grid[5][6].equals("R"))){
      gameOver = true;
    }


      else if ((grid[3][0].equals("R"))&(grid[2][1].equals("R"))&(grid[1][2].equals("R"))&(grid[0][3].equals("R"))){
      gameOver = true;
    } else if ((grid[4][0].equals("R"))&(grid[3][1].equals("R"))&(grid[2][2].equals("R"))&(grid[1][3].equals("R"))){
      gameOver = true;
    } else if ((grid[3][1].equals("R"))&(grid[2][2].equals("R"))&(grid[1][3].equals("R"))&(grid[0][4].equals("R"))){
      gameOver = true;
    } else if ((grid[5][0].equals("R"))&(grid[4][1].equals("R"))&(grid[3][2].equals("R"))&(grid[2][3].equals("R"))){
      gameOver = true;
    } else if ((grid[4][1].equals("R"))&(grid[3][2].equals("R"))&(grid[2][3].equals("R"))&(grid[1][4].equals("R"))){
      gameOver = true;
    } else if ((grid[3][2].equals("R"))&(grid[2][3].equals("R"))&(grid[1][4].equals("R"))&(grid[0][5].equals("R"))){
      gameOver = true;
    } else if ((grid[5][1].equals("R"))&(grid[4][2].equals("R"))&(grid[3][3].equals("R"))&(grid[2][4].equals("R"))){
      gameOver = true;
    } else if ((grid[4][2].equals("R"))&(grid[3][3].equals("R"))&(grid[2][4].equals("R"))&(grid[1][5].equals("R"))){
      gameOver = true;
    } else if ((grid[3][3].equals("R"))&(grid[2][4].equals("R"))&(grid[1][5].equals("R"))&(grid[0][6].equals("R"))){
      gameOver = true;
    } else if ((grid[5][2].equals("R"))&(grid[4][3].equals("R"))&(grid[3][4].equals("R"))&(grid[2][5].equals("R"))){
      gameOver = true;
    } else if ((grid[4][3].equals("R"))&(grid[3][4].equals("R"))&(grid[2][5].equals("R"))&(grid[1][6].equals("R"))){
      gameOver = true;
    } else if ((grid[5][3].equals("R"))&(grid[4][4].equals("R"))&(grid[3][5].equals("R"))&(grid[2][6].equals("R"))){
      gameOver = true;
    }



      else if ((grid[2][0].equals("R"))&(grid[3][1].equals("R"))&(grid[4][2].equals("R"))&(grid[5][3].equals("R"))){
      gameOver = true;
    } else if ((grid[1][0].equals("R"))&(grid[2][1].equals("R"))&(grid[3][2].equals("R"))&(grid[4][3].equals("R"))){
      gameOver = true;
    } else if ((grid[2][1].equals("R"))&(grid[3][2].equals("R"))&(grid[4][3].equals("R"))&(grid[5][4].equals("R"))){
      gameOver = true;
    } else if ((grid[0][0].equals("R"))&(grid[1][1].equals("R"))&(grid[2][2].equals("R"))&(grid[3][3].equals("R"))){
      gameOver = true;
    } else if ((grid[1][1].equals("R"))&(grid[2][2].equals("R"))&(grid[3][3].equals("R"))&(grid[4][4].equals("R"))){
      gameOver = true;
    } else if ((grid[2][2].equals("R"))&(grid[3][3].equals("R"))&(grid[4][4].equals("R"))&(grid[5][5].equals("R"))){
      gameOver = true;
    } else if ((grid[0][1].equals("R"))&(grid[1][2].equals("R"))&(grid[2][3].equals("R"))&(grid[3][4].equals("R"))){
      gameOver = true;
    } else if ((grid[1][2].equals("R"))&(grid[2][3].equals("R"))&(grid[3][4].equals("R"))&(grid[4][5].equals("R"))){
      gameOver = true;
    } else if ((grid[2][3].equals("R"))&(grid[3][4].equals("R"))&(grid[4][5].equals("R"))&(grid[5][6].equals("R"))){
      gameOver = true;
    } else if ((grid[0][2].equals("R"))&(grid[1][3].equals("R"))&(grid[2][4].equals("R"))&(grid[3][5].equals("R"))){
      gameOver = true;
    } else if ((grid[1][3].equals("R"))&(grid[2][4].equals("R"))&(grid[3][5].equals("R"))&(grid[4][6].equals("R"))){
      gameOver = true;
    } else if ((grid[0][3].equals("R"))&(grid[1][4].equals("R"))&(grid[2][5].equals("R"))&(grid[3][6].equals("R"))){
      gameOver = true;
    }


      else if ((grid[0][0].equals("B"))&(grid[0][1].equals("B"))&(grid[0][2].equals("B"))&(grid[0][3].equals("B"))){
      gameOver = true;
     } else if ((grid[0][1].equals("B"))&(grid[0][2].equals("B"))&(grid[0][3].equals("B"))&(grid[0][4].equals("B"))){
       gameOver = true;
     } else if ((grid[0][2].equals("B"))&(grid[0][3].equals("B"))&(grid[0][4].equals("B"))&(grid[0][5].equals("B"))){
       gameOver = true;
     } else if ((grid[0][3].equals("B"))&(grid[0][4].equals("B"))&(grid[0][5].equals("B"))&(grid[0][6].equals("B"))){
       gameOver = true;
     } else if ((grid[1][0].equals("B"))&(grid[1][1].equals("B"))&(grid[1][2].equals("B"))&(grid[1][3].equals("B"))){
       gameOver = true;
     } else if ((grid[1][1].equals("B"))&(grid[1][2].equals("B"))&(grid[1][3].equals("B"))&(grid[1][4].equals("B"))){
       gameOver = true;
     } else if ((grid[1][2].equals("B"))&(grid[1][3].equals("B"))&(grid[1][4].equals("B"))&(grid[1][5].equals("B"))){
       gameOver = true;
     } else if ((grid[1][3].equals("B"))&(grid[1][4].equals("B"))&(grid[1][5].equals("B"))&(grid[1][6].equals("B"))){
       gameOver = true;
     } else if ((grid[2][0].equals("B"))&(grid[2][1].equals("B"))&(grid[2][2].equals("B"))&(grid[2][3].equals("B"))){
       gameOver = true;
     } else if ((grid[2][1].equals("B"))&(grid[2][2].equals("B"))&(grid[2][3].equals("B"))&(grid[2][4].equals("B"))){
       gameOver = true;
     } else if ((grid[2][2].equals("B"))&(grid[2][3].equals("B"))&(grid[2][4].equals("B"))&(grid[2][5].equals("B"))){
       gameOver = true;
     } else if ((grid[2][3].equals("B"))&(grid[2][4].equals("B"))&(grid[2][5].equals("B"))&(grid[2][6].equals("B"))){
       gameOver = true;
     } else if ((grid[3][0].equals("B"))&(grid[3][1].equals("B"))&(grid[3][2].equals("B"))&(grid[3][3].equals("B"))){
       gameOver = true;
     } else if ((grid[3][1].equals("B"))&(grid[3][2].equals("B"))&(grid[3][3].equals("B"))&(grid[3][4].equals("B"))){
       gameOver = true;
     } else if ((grid[3][2].equals("B"))&(grid[3][3].equals("B"))&(grid[3][4].equals("B"))&(grid[3][5].equals("B"))){
       gameOver = true;
     } else if ((grid[3][3].equals("B"))&(grid[3][4].equals("B"))&(grid[3][5].equals("B"))&(grid[3][6].equals("B"))){
       gameOver = true;
     } else if ((grid[4][0].equals("B"))&(grid[4][1].equals("B"))&(grid[4][2].equals("B"))&(grid[4][3].equals("B"))){
       gameOver = true;
     } else if ((grid[4][1].equals("B"))&(grid[4][2].equals("B"))&(grid[4][3].equals("B"))&(grid[4][4].equals("B"))){
       gameOver = true;
     } else if ((grid[4][2].equals("B"))&(grid[4][3].equals("B"))&(grid[4][4].equals("B"))&(grid[4][5].equals("B"))){
       gameOver = true;
     } else if ((grid[4][3].equals("B"))&(grid[4][4].equals("B"))&(grid[4][5].equals("B"))&(grid[4][6].equals("B"))){
       gameOver = true;
     } else if ((grid[5][0].equals("B"))&(grid[5][1].equals("B"))&(grid[5][2].equals("B"))&(grid[5][3].equals("B"))){
       gameOver = true;
     } else if ((grid[5][1].equals("B"))&(grid[5][2].equals("B"))&(grid[5][3].equals("B"))&(grid[5][4].equals("B"))){
       gameOver = true;
     } else if ((grid[5][2].equals("B"))&(grid[5][3].equals("B"))&(grid[5][4].equals("B"))&(grid[5][5].equals("B"))){
       gameOver = true;
     } else if ((grid[5][3].equals("B"))&(grid[5][4].equals("B"))&(grid[5][5].equals("B"))&(grid[5][6].equals("B"))){
       gameOver = true;
     }



       else if ((grid[0][0].equals("B"))&(grid[1][0].equals("B"))&(grid[2][0].equals("B"))&(grid[3][0].equals("B"))){
         gameOver = true;
     } else if ((grid[1][0].equals("B"))&(grid[2][0].equals("B"))&(grid[3][0].equals("B"))&(grid[4][0].equals("B"))){
       gameOver = true;
     } else if ((grid[2][0].equals("B"))&(grid[3][0].equals("B"))&(grid[4][0].equals("B"))&(grid[5][0].equals("B"))){
       gameOver = true;
     } else if ((grid[0][1].equals("B"))&(grid[1][1].equals("B"))&(grid[2][1].equals("B"))&(grid[3][1].equals("B"))){
       gameOver = true;
     } else if ((grid[1][1].equals("B"))&(grid[2][1].equals("B"))&(grid[3][1].equals("B"))&(grid[4][1].equals("B"))){
       gameOver = true;
     } else if ((grid[2][1].equals("B"))&(grid[3][1].equals("B"))&(grid[4][1].equals("B"))&(grid[5][1].equals("B"))){
       gameOver = true;
     } else if ((grid[0][2].equals("B"))&(grid[1][2].equals("B"))&(grid[2][2].equals("B"))&(grid[3][2].equals("B"))){
       gameOver = true;
     } else if ((grid[1][2].equals("B"))&(grid[2][2].equals("B"))&(grid[3][2].equals("B"))&(grid[4][2].equals("B"))){
       gameOver = true;
     } else if ((grid[2][2].equals("B"))&(grid[3][2].equals("B"))&(grid[4][2].equals("B"))&(grid[5][2].equals("B"))){
       gameOver = true;
     } else if ((grid[0][3].equals("B"))&(grid[1][3].equals("B"))&(grid[2][3].equals("B"))&(grid[3][3].equals("B"))){
       gameOver = true;
     } else if ((grid[1][3].equals("B"))&(grid[2][3].equals("B"))&(grid[3][3].equals("B"))&(grid[4][3].equals("B"))){
       gameOver = true;
     } else if ((grid[2][3].equals("B"))&(grid[3][3].equals("B"))&(grid[4][3].equals("B"))&(grid[5][3].equals("B"))){
       gameOver = true;
     } else if ((grid[0][4].equals("B"))&(grid[1][4].equals("B"))&(grid[2][4].equals("B"))&(grid[3][4].equals("B"))){
       gameOver = true;
     } else if ((grid[1][4].equals("B"))&(grid[2][4].equals("B"))&(grid[3][4].equals("B"))&(grid[4][4].equals("B"))){
       gameOver = true;
     } else if ((grid[2][4].equals("B"))&(grid[3][4].equals("B"))&(grid[4][4].equals("B"))&(grid[5][4].equals("B"))){
       gameOver = true;
     } else if ((grid[0][5].equals("B"))&(grid[1][5].equals("B"))&(grid[2][5].equals("B"))&(grid[3][5].equals("B"))){
       gameOver = true;
     } else if ((grid[1][5].equals("B"))&(grid[2][5].equals("B"))&(grid[3][5].equals("B"))&(grid[4][5].equals("B"))){
       gameOver = true;
     } else if ((grid[2][5].equals("B"))&(grid[3][5].equals("B"))&(grid[4][5].equals("B"))&(grid[5][5].equals("B"))){
       gameOver = true;
     } else if ((grid[0][6].equals("B"))&(grid[1][6].equals("B"))&(grid[2][6].equals("B"))&(grid[3][6].equals("B"))){
       gameOver = true;
     } else if ((grid[1][6].equals("B"))&(grid[2][6].equals("B"))&(grid[3][6].equals("B"))&(grid[4][6].equals("B"))){
       gameOver = true;
     } else if ((grid[2][6].equals("B"))&(grid[3][6].equals("B"))&(grid[4][6].equals("B"))&(grid[5][6].equals("B"))){
       gameOver = true;
     }


       else if ((grid[3][0].equals("B"))&(grid[2][1].equals("B"))&(grid[1][2].equals("B"))&(grid[0][3].equals("B"))){
         gameOver = true;
     } else if ((grid[4][0].equals("B"))&(grid[3][1].equals("B"))&(grid[2][2].equals("B"))&(grid[1][3].equals("B"))){
       gameOver = true;
     } else if ((grid[3][1].equals("B"))&(grid[2][2].equals("B"))&(grid[1][3].equals("B"))&(grid[0][4].equals("B"))){
       gameOver = true;
     } else if ((grid[5][0].equals("B"))&(grid[4][1].equals("B"))&(grid[3][2].equals("B"))&(grid[2][3].equals("B"))){
       gameOver = true;
     } else if ((grid[4][1].equals("B"))&(grid[3][2].equals("B"))&(grid[2][3].equals("B"))&(grid[1][4].equals("B"))){
       gameOver = true;
     } else if ((grid[3][2].equals("B"))&(grid[2][3].equals("B"))&(grid[1][4].equals("B"))&(grid[0][5].equals("B"))){
       gameOver = true;
     } else if ((grid[5][1].equals("B"))&(grid[4][2].equals("B"))&(grid[3][3].equals("B"))&(grid[2][4].equals("B"))){
       gameOver = true;
     } else if ((grid[4][2].equals("B"))&(grid[3][3].equals("B"))&(grid[2][4].equals("B"))&(grid[1][5].equals("B"))){
       gameOver = true;
     } else if ((grid[3][3].equals("B"))&(grid[2][4].equals("B"))&(grid[1][5].equals("B"))&(grid[0][6].equals("B"))){
       gameOver = true;
     } else if ((grid[5][2].equals("B"))&(grid[4][3].equals("B"))&(grid[3][4].equals("B"))&(grid[2][5].equals("B"))){
       gameOver = true;
     } else if ((grid[4][3].equals("B"))&(grid[3][4].equals("B"))&(grid[2][5].equals("B"))&(grid[1][6].equals("B"))){
       gameOver = true;
     } else if ((grid[5][3].equals("B"))&(grid[4][4].equals("B"))&(grid[3][5].equals("B"))&(grid[2][6].equals("B"))){
       gameOver = true;
     }



       else if ((grid[2][0].equals("B"))&(grid[3][1].equals("B"))&(grid[4][2].equals("B"))&(grid[5][3].equals("B"))){
         gameOver = true;
     } else if ((grid[1][0].equals("B"))&(grid[2][1].equals("B"))&(grid[3][2].equals("B"))&(grid[4][3].equals("B"))){
       gameOver = true;
     } else if ((grid[2][1].equals("B"))&(grid[3][2].equals("B"))&(grid[4][3].equals("B"))&(grid[5][4].equals("B"))){
       gameOver = true;
     } else if ((grid[0][0].equals("B"))&(grid[1][1].equals("B"))&(grid[2][2].equals("B"))&(grid[3][3].equals("B"))){
       gameOver = true;
     } else if ((grid[1][1].equals("B"))&(grid[2][2].equals("B"))&(grid[3][3].equals("B"))&(grid[4][4].equals("B"))){
       gameOver = true;
     } else if ((grid[2][2].equals("B"))&(grid[3][3].equals("B"))&(grid[4][4].equals("B"))&(grid[5][5].equals("B"))){
       gameOver = true;
     } else if ((grid[0][1].equals("B"))&(grid[1][2].equals("B"))&(grid[2][3].equals("B"))&(grid[3][4].equals("B"))){
       gameOver = true;
     } else if ((grid[1][2].equals("B"))&(grid[2][3].equals("B"))&(grid[3][4].equals("B"))&(grid[4][5].equals("B"))){
       gameOver = true;
     } else if ((grid[2][3].equals("B"))&(grid[3][4].equals("B"))&(grid[4][5].equals("B"))&(grid[5][6].equals("B"))){
       gameOver = true;
     } else if ((grid[0][2].equals("B"))&(grid[1][3].equals("B"))&(grid[2][4].equals("B"))&(grid[3][5].equals("B"))){
       gameOver = true;
     } else if ((grid[1][3].equals("B"))&(grid[2][4].equals("B"))&(grid[3][5].equals("B"))&(grid[4][6].equals("B"))){
       gameOver = true;
     } else if ((grid[0][3].equals("B"))&(grid[1][4].equals("B"))&(grid[2][5].equals("B"))&(grid[3][6].equals("B"))){
       gameOver = true;
     }

     if (gameOver){
       if (turn.equals("R")){
         RightSidePanel.turnLabel.setText("Black Wins!");
       } else if (turn.equals("B")){
         RightSidePanel.turnLabel.setText("Red Wins!");
       }
       for(int i = 0; i < 7; i++){
         Board.sbutton[i].disableButton();
       }
     } else {
       if (turn.equals("R")){
         RightSidePanel.turnLabel.setText("Red's Turn!");
       } else if (turn.equals("B")){
         RightSidePanel.turnLabel.setText("Black's Turn!");
       }
     }


  }



  public static void main(String[] args) {
    new Connect4();
  }

}
