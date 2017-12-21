package com.dima;

public class Board {
  public final int CLASSIC = 3;
  private int size;
  private char[][] field;

  public Board() {
    size = CLASSIC;
    field = new char[3][3];
    intialize();
  }

  private void intialize() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        field[i][j] = ' ';
      }
    }
  }

  public void draw() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (j > 0 && j < size) {
          System.out.print("|");
        }
        if (field[i][j] != ' ') {
          System.out.print(" " + field[i][j] + " ");
        } else {
          System.out.print(" " + (i * 3 + j) + " ");
        }
      }
      if (i < size - 1) {
        System.out.println("\n___________");
      }
    }
  }
}
