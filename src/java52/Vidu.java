package java52;

import java.util.Locale;

public class Vidu {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = ".com";
    //Hàm concat -> nối chuỗi
    String s3 = s1.concat(s2);
    System.out.println("s3 = " + s3);
    //Hàm replaceAll => thay thế chuỗi
    String s4 = "Tung.vn";
    String s5 = s4.replaceAll("Tung", "titv");
    System.out.println("s5 = " + s5);
    //toLowerCase -> chuyển về viết thường
    //toUppercase -> Chuyển về viết hoa
    String s7 = s3.toLowerCase();
    String s8 = s3.toUpperCase();
    System.out.println("S7 = " + s7);
    System.out.println("S8 = " + s8);
    //Trim -> xóa khoảng trắng dưa thừa ở đầu chuỗi
    String s9 = " acnnncncncnnnncnc ";
    System.out.println(s9.trim());
    //Subtring -> cắt chuỗi con
    String s10 = "Xin chào các bạn mình là lơm";
    String s11 = s10.substring(10);
    String s12 = s10.substring(10,15);
    System.out.println("s11" + s11);
    System.out.println("s12" + s12);
  }
}
