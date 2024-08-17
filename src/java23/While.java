package java23;

import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    // Vòng lặp while : thường sử dụng khi chúng ta không biết điều kiện nó đúng
    int x = 1;
    Scanner sc = new Scanner(System.in);
    while(x!= 0) {
      System.out.println("Nhập x = 0 để thoát ,Nhập ký tự khác để tiếp tục ");
      x = sc.nextInt();
    }
  }
}
