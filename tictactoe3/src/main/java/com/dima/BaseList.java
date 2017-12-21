package com.dima;

public interface BaseList {
  int size();
  void add(int num);
  void remove(int index);
  int get(int index);
  int getRandom();
  int search(int num);
}
