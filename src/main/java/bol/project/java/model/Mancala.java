package bol.project.java.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mancala {

  int[] mancalaBoard = {0,6,6,6,6,6,6,0,6,6,6,6,6,6};

  public Mancala() {
  }

  public int[] getMancalaBoard() {
    return mancalaBoard;
  }

  public void setMancalaBoard(int[] mancalaBoard) {
    this.mancalaBoard = mancalaBoard;
  }

  // public void p1Plays(int position) {

  // }

  // public void p2Plays(int position) {

  // }
}