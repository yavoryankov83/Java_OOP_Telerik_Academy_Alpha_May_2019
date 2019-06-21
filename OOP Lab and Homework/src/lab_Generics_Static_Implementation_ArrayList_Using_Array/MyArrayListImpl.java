package lab_Generics_Static_Implementation_ArrayList_Using_Array;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayListImpl<E> implements MyArrayList<E> {

  private final int initialCapacity;

  private int size;
  private Object[] data;

  public MyArrayListImpl() {
    initialCapacity = 4;
    data = new Object[initialCapacity];
  }

  @Override
  public void add(E value) {
    if (size == data.length) {
      data = Arrays.copyOf(data, data.length * 2);
    }

    data[size++] = value;
  }

  @Override
  public E getElement(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    return (E) data[index];
  }

  @Override
  public void setElement(E value, int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    data[index] = value;
  }

  @Override
  public int find(E value) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(value)) {
        return i;
      }
    }

    return -1;
  }

  @Override
  public Iterator<E> iterator() {
    return new MyArrayListIterator();
  }

  private class MyArrayListIterator implements Iterator<E> {

    private int currentIndex;

    @Override
    public boolean hasNext() {
      return currentIndex < size;
    }

    @Override
    public E next() {
      return (E) data[currentIndex++];
    }
  }
}
