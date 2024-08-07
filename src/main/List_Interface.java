package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Interface {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    List<String> listString = new LinkedList<String>();
    list.add("One");
    list.add("Two");
    list.add("Three");
    list.add("Four");
    System.out.println("Các phần tử có trong list là : ");
    for (String element : list) {
      System.out.println(element);
    }
    System.out.println("---------------------------------");
    listString.add("abc");
    listString.add("abcd");
    listString.add("efgh");
    listString.add("name");
    for(int i = 0 ; i< listString.size() ; i++) {
      System.out.println(listString.get(i));
    }
    List<Float> listFloat = new ArrayList<>(1000);
    listFloat.add(1.0f);
    listFloat.add(10f);
    listFloat.add(0.02f);
    listFloat.add(10.41f);
    listFloat.add(20.17f);
    listFloat.add(2,5.5f);
    System.out.println("Các phần tử có trong listFloat là : ");
    for(float numberFloat  : listFloat) {
      System.out.println(numberFloat);
    }
  }
}
