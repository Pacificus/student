package com.dima;

import java.util.NoSuchElementException;

public class IntList implements BaseList {
  public static int SIZE = 3;
  private int size;
  private int index;
  private int[] array;

  public IntList() {
    size = SIZE;
    index = 0;
    array = new int[size];
  }

  public IntList(int capasity) {
    size = capasity;
    index = 0;
    array = new int[size];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public void add(int num) {
    if (index == size) {
      size *= 2;
      int[] buf = new int[size];
      copy(buf, array);
      array = buf;
    }
    array[index] = num;
    index++;
  }

  private void copy(int[] buf, int[] array) {
    for (int i = 0; i < array.length; i++) {
      buf[i] = array[i];
    }
  }

  @Override
  public void remove(int index) {
    if (!isValidIndex(index)){
      return;
    }
    this.index--;
    if (size / index > 4) {
      reduce();
    }
    for (int i = index; i < this.index; i++) {
      array[i] = array[i + 1];
    }
  }

  private boolean isValidIndex(int index) {
    return index > 0 && index < this.index;
  }

  private void reduce() {
    size /= 2;
    int[] buf = new int[size];
    copy(buf, array, index);
    array = buf;
  }

  private void copy(int[] buf, int[] array, int index) {
    for (int i = 0; i < index; i++) {
      buf[i] = array[i];
    }
  }

  @Override
  public int get(int index) {
    if (!isValidIndex(index)) {
      throw new NoSuchElementException("It has no elements");
    }
    return array[index];
  }

  @Override
  public int getRandom() {
    int ranIndex = rand(this.index);
    return array[ranIndex];
  }

  public static int rand(int index) {
    return (int) (Math.random() * (double) index);
  }

  @Override
  public int search(int num) {
    for (int i = 0; i < index; i++) {
      if (array[i] == num) {
        return i;
      }
    }

    return -1;
  }

  public void show() {
    for (int i = 0; i < index; i++) {
      System.out.println(array[i] + " ");
    }
  }
}
