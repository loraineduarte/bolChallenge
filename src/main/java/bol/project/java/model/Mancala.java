package bol.project.java.model;

import java.util.HashMap;
import java.util.Map;

public class Mancala {

  public int p1_mancala = 0;
  public Map<Integer, Integer> p1_pits = new HashMap<Integer, Integer>();

  public int p2_mancala = 0;
  public Map<Integer, Integer> p2_pits = new HashMap<Integer, Integer>();

  public Mancala() {
    p1_pits.put(1, 6);
    p1_pits.put(2, 6);
    p1_pits.put(3, 6);
    p1_pits.put(4, 6);
    p1_pits.put(5, 6);
    p1_pits.put(6, 6);

    p2_pits.put(1, 6);
    p2_pits.put(2, 6);
    p2_pits.put(3, 6);
    p2_pits.put(4, 6);
    p2_pits.put(5, 6);
    p2_pits.put(6, 6);
  }

  public int getp1_mancala() {
    return p1_mancala;
  }

  public void setp1_mancala(int p1_mancala) {
    this.p1_mancala = p1_mancala;
  }

  public int getp2_mancala() {
    return p2_mancala;
  }

  public void setp2_mancala(int p2_mancala) {
    this.p2_mancala = p2_mancala;
  }

}