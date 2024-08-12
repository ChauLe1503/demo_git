package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Colections {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Ac");
    arrayList.add("AB");
    arrayList.add("Ac");
    arrayList.add("Ac");
    arrayList.add("Ac");
    arrayList.add("Ac");
    // sử dụng iterator
    Iterator<String> iterator = arrayList.iterator();
    System.out.println("Các phần tử có trong arrList là: ");
    for(String arrs : arrayList) {
      System.out.println(arrs);
    }
    System.out.println("-------------------------");
    while(iterator.hasNext()){
      System.out.println(iterator.next() + "\t");
    }

    ArrayList<Character> arrListChar  = new ArrayList<>();
    arrListChar.add('a');
    arrListChar.add('c');
    arrListChar.add('e');
    arrListChar.add('g');
    arrListChar.add('f');
    // khai báo một ListIterator có kiểu là Character
    Iterator<Character> listIterator = arrListChar.listIterator();
    //hiển thị các phần tử có trong linkedList
    // bằng cách sử dụng ListIterator
    System.out.println("Các phần tử có trong arrListChar là : ");
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next() + "\t");
    }
  }
}
