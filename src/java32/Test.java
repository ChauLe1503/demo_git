package java32;

public class Test {
  public static void main(String[] args) {
    MyDate md = new MyDate(31, 9, 2021);
    System.out.println("Day : " + md.getDay());
    md.setDay(32);
    System.out.println("Day : " + md.getDay());

    System.out.println("Month : " + md.getMonth());
    md.setMonth(13);
    System.out.println("Month : " + md.getMonth());
    md.setMonth(5);
    System.out.println("Month : " + md.getMonth());
  }
}
