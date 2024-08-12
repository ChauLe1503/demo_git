package java51;

public class Vidu {
  public static void main(String[] args) {
    String s1 = "Xin chào cô chú,xin chào các bạn,xin chao!";
    String s2 = "Xin chào";
    String s3 = "Xin chào 123";
    char c1 = 'ô';
    // Hàm indexOf
    System.out.println("Vị trí của s2 trong s1 là : " + s1.indexOf(s2));
    System.out.println("Vị trí của s3 trong s1 là : " + s1.indexOf(s3));
    // Sử dụng vị trí bắt đâu
    System.out.println("Vị trí của s2 trong s1 là : " + s1.indexOf(s2, 2));
    // Tìm kiếm char
    System.out.println("Vị trí của s2 trong s1 là : " + s1.indexOf(c1));
    System.out.println("Vị trí của s3 trong s1 là : " + s1.indexOf(s1,20));
    // Hàm lastIndexOf -> tìm kiếm từ phải sang trái
    System.out.println("Vị trí của s2 trong s1(Từ phải sang trái) là : " + s1.lastIndexOf(s2));
  }
}
