package java49;

import java.util.Locale;
import java.util.Scanner;

public class Vidu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s;
    System.out.println("Nhâp vào 1 chuỗi : ");
    s = sc.nextLine();
    System.out.println("-----------------");
    // Hàm length() : độ dài
    System.out.println(s.length());
    int doDai = s.length();
    // Hàm charAt (vị trí) : lấy ra 1 ký tự tại vị trí
    for(int i = 0 ; i < doDai ; i++) {
      System.out.println("Vị trí " + i + " là : " + s.charAt(i));
    }
    // Hàm getChars(Vị trí bắt đầu ,vị trí kết thúc,
    // mảng lưu dữ liệu , vị trí bắt đầu lưu của mảng)
    char [] arrayChar = new char[100];
    s.getChars(2,4,arrayChar,0);
    for(int i = 0 ; i < arrayChar.length ; i++){
      System.out.println("Giá trị của mảng tại " + i + " là : ");
    }
  }
}
