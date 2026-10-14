package ua.edu.chnu.gof.iterator;

import java.util.Iterator;

public class Infinity2PowIterator implements Iterator<Integer> {
  private Integer currentValue;


  public Infinity2PowIterator() {
    currentValue = 1;
  }

  @Override
  public boolean hasNext() {
    return true;
  }

  @Override
  public Integer next() {
    currentValue = currentValue * 2;
    return currentValue;
  }
}
