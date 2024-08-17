package java25;

import java.util.Scanner;

public class Do_While {
  public static void main(String[] args) {
    // Vòng lặp do-while : Vòng lặp được kiểm tra sau
    // Điều kiện được kiểm tra sau khi câu lệnh
    // Trong phạm vi vòng lặp được thực thi
    // Vòng lặp được thực thi ít nhất 1 lần
    // Thậm chí nếu điều kiện không thỏa mãn tại điểm bắt đầu
//    int count = 1;
//    do {
//      System.out.println("Count is : " + count);
//      count++;
//    } while (count <= 0);
    int n;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Nhập vào n lớn hơn 0 : ");
      n = sc.nextInt();
    } while (n <= 0);
  }
}
