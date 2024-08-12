package main;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {
  public static void main(String[] args) {
//    Set<Character> setChar = new TreeSet<Character>();
//    setChar.add('A');
//    setChar.add('B');
//    setChar.add('C');
//    setChar.add('D');
//    System.out.println("Các phần tử có trong Treeset là : ");
//    for(char ch : setChar) {
//      System.out.println(ch);
//    }
    // Thêm mới các phần tử
    int number;
    Set<Integer> setInteger = new TreeSet<>();
    Scanner scanner = new Scanner(System.in);
    setInteger.add(2);
    setInteger.add(5);
    setInteger.add(3);
    setInteger.add(9);
    setInteger.add(8);
    System.out.println("Các phần tử trong setInteger : ");
    System.out.println(setInteger);
    System.out.println("Nhập phần tử cần thêm : ");
    number = scanner.nextInt();
    if (!setInteger.contains(number)) {
      setInteger.add(number);
      System.out.println("Thêm thành công!");
      System.out.println("Các phần tử trong setInteger sau khi thêm: ");
      System.out.println(setInteger);
    } else {
      System.out.println("Phần tử " + number + " đã tồn tại!");
    }
    // Xóa các phần tử : remove
    String str;
    Set<String> setString = new TreeSet<>();
    Scanner sc = new Scanner(System.in);
    setString.add("Java");
    setString.add("Oop");
    setString.add("Php");
    setString.add("C#");
    setString.add("C");
    System.out.println("Các phần tử trong setString là : ");
    System.out.println(setString);
    System.out.println("Nhập phần tử cần xóa: ");
    str = sc.nextLine();
    if (setString.contains(str)) {
      setString.remove(str);
      System.out.println("Xóa thành công!");
      System.out.println("Các phần tử còn lại trong setString:");
      System.out.println(setString);
    } else {
      System.out.println("Xóa không thành công!");
    }
  }
}
