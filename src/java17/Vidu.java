package java17;

import java.util.Scanner;

public class Vidu {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập số nguyên n: ");
    n = sc.nextInt();
    if (n % 2 == 0) {
      System.out.println(n + " Là số chẵn ");
    } else {
      System.out.println(n + " Là số lẻ ");
    }
  }
}
