package main;

import java.util.Scanner;

public class TestGit {
  public static void main(String[] args) {
    String chuoi;
    int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Nhập vào 1 chuỗi bất kỳ : ");
      chuoi = sc.nextLine();
    } while (chuoi.length() > 80);
    for (int i = 0; i < chuoi.length(); i++) {
      if (Character.isUpperCase(chuoi.charAt(i))) {
        soKyTuInHoa++;
      }
      if (Character.isLowerCase(chuoi.charAt(i))) {
        soKyTuInThuong++;
      }
      if (Character.isDigit(chuoi.charAt(i))) {
        soChuSo++;
      }
    }
    System.out.println("Trong chuỗi có " + chuoi +
        " Có " + soKyTuInHoa +
        " ký tự in hoa, " + " Có " + soKyTuInThuong +
        " ký tự in thường, " + " Và có " + soChuSo + " số. ");
  }
}
