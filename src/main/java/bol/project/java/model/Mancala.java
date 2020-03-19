package bol.project.java.model;

public class Mancala {

  int[] mancalaBoard = { 0, 6, 6, 6, 6, 6, 6, 0, 6, 6, 6, 6, 6, 6 };

  private static Mancala single_instance = null;

  public Mancala() {
  }

  public static Mancala getInstance() {
    if (single_instance == null)
      single_instance = new Mancala();

    return single_instance;
  }

  public int[] getMancalaBoard() {
    return mancalaBoard;
  }

  public void setMancalaBoard(int[] mancalaBoard) {
    this.mancalaBoard = mancalaBoard;
  }

  public int[] resetBoard() {
    mancalaBoard={0,6,6,6,6,6,6,0,6,6,6,6,6,6};

    return mancalaBoard;
  }
  // public void p1Plays(int position) {

  // }

  // public void p2Plays(int position) {

  // }
}