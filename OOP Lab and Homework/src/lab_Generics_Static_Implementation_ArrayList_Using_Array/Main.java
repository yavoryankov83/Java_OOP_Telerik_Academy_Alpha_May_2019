package lab_Generics_Static_Implementation_ArrayList_Using_Array;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    MyArrayList<Integer> nums = new MyArrayListImpl<>();

    nums.add(1);
    nums.add(78);
    nums.add(1458);
    nums.add(47);
    nums.add(5);
    nums.add(88);

    Iterator<Integer> iterator = nums.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
