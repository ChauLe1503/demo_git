package java31;

public class Test {
  public static void main(String[] args) {
    HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyên", 1000000, 6.5);
    HoaDonCaPhe hd1 = new HoaDonCaPhe("Trung Nguyên", 1000000, 5.5);
    System.out.println("Tổng tiền : " + hd.tinhTongTien());
    System.out.println("Kiểm tra khối lượng lớn hơn 2kg " + hd.kiemTraKhoiLuongLonHon(2));
    System.out.println("Kiểm tra khối lượng lớn hơn 1kg " + hd.kiemTraKhoiLuongLonHon(1));
    System.out.println("Kiểm tra tổng tiền lớn hơn 500K " + hd.kiemTraTongTienLonHon500K());
    System.out.println("Giảm giá của hd : " + hd.giamGia(10));
    System.out.println("Giảm giá của hd1 : " + hd1.giamGia(10));
    System.out.println("Sau Giảm giá của hd : " + hd.giaSauKhiGiam(10));
    System.out.println("Sau Giảm giá của hd1 : " + hd1.giaSauKhiGiam(10));
  }
}
