package java39;

public class Test {
  public static void main(String[] args) {
    System.out.println("Kiểm tra");
    ConNguoi cn = new ConNguoi("abc",1996);
    cn.an();
    cn.uong();
    cn.ngu();
    HocSinh hs = new HocSinh("cbs",1,"truong1","năm1");
    hs.an();
    hs.uong();
    hs.ngu();
    hs.lamBaiTap();
  }
}
