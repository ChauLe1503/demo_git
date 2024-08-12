package java50;

public class Vidu {
  public static void main(String[] args) {

    String s1 = "titv.vn";
    String s2 = "TITV.vn";
    String s3 = "titv.vn";
    // Hàm equals -> so sánh 2 chuỗi giống nhau có phân biệt hoa thường
    System.out.println("s1 equlas s2 : " + s1.equals(s2));
    System.out.println("s1 equlas s3 : " + s1.equals(s3));
    // Hàm equalsIngnoreCase -> So sánh 2 chuỗi giống nhau ,không phân biệt hoa thường
    System.out.println("s1 equalsIngnoreCase s2 : " + s1.equalsIgnoreCase(s2));
    System.out.println("s1 equalsIngnoreCase s3 : " + s1.equalsIgnoreCase(s3));

    // Hàm compareto -> so sánh > < =
    String sv1 = "Nguyễn Văn A";
    String sv2 = "Nguyễn Văn B";
    String sv3 = "Nguyễn Văn C";
    String sv4 = "Nguyễn Văn A";
    System.out.println("sv1 compareto sv2 : " + sv1.compareTo(sv2));
    System.out.println("sv1 compareto sv3 : " + sv1.compareTo(sv3));
    System.out.println("sv1 compareto sv4 : " + sv1.compareTo(sv4));

    // comparatoIngnoreCase -> Tương tự như compareto,không phân biệt hoa thường
    // Hàm RegionMatches => So sánh một đoạn
    String r1 = "TITV.vn";
    String r2 = "TV.v";
    boolean check = r1.regionMatches(2, r2, 0, 4);
    System.out.println(check);

    // Hàm starWith -> Hàm kiểm tra chuỗi bắt đầu bằng...
    String sdt = "037456789";
    System.out.println(sdt.startsWith("037"));
    System.out.println(sdt.startsWith("034"));

    // Hàm endWith -> Hàm kiểm tra chuỗi kết thúc bằng...
    String tenFile = "I love you.jpg";
    String tenFile2 = "Học java.pdf";
    if(tenFile.endsWith(".jpg")) {
      System.out.println("File 1 là hình ảnh!");
    }else if(tenFile.endsWith(".pdf")) {
      System.out.println("File 1 là file pdf!");
    }
    if(tenFile2.endsWith(".jpg")) {
      System.out.println("File 2 là hình ảnh!");
    }else if(tenFile2.endsWith(".pdf")) {
      System.out.println("File 2 là file pdf!");
    }
  }
}
