package lab_Generics_Static_Implementation_ArrayList_Using_Array;

public interface MyArrayList<E> extends Iterable<E> {

  void add(E value);

  E getElement(int index);

  void setElement(E value, int index);

  int find(E value);
}
