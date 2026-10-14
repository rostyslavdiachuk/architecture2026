package ua.edu.chnu.gof.iterator;

import java.util.Iterator;

public class Infinity2Pow implements Iterable<Integer> {
  @Override
  public Iterator<Integer> iterator() {
    return new Infinity2PowIterator();
  }
}
