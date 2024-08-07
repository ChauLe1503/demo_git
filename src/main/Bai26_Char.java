package main;

import java.util.Scanner;

public class Bai26_Char {
  public static void main(String[] args) {
    char ch = 'a';// khơi tạo
    char ch2 = 66;
    System.out.println(ch2);
    char c;//khai báo
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào 1 ký tự : ");
    String s = sc.nextLine();
    char cha4 = s.charAt(0);
    System.out.println("Ký tự vừa nhập : " + cha4);

    char ch5 = '1';
    char ch6 = 'a';
    char ch7 = 'A';
    char ch8 = ' ';
    System.out.println(Character.isDigit(ch5));// Kiểm tra ch5 có phải là 1 số hay không
    System.out.println(Character.isLetter(ch6));// Kiểm tra ch6 có phải là ký tự hay không
    System.out.println(Character.isLowerCase(ch7));// Kiểm tra ch6 có phải là chữ viết thường hay không
    System.out.println(Character.isUpperCase(ch7));// Kiểm tra ch7 có phải là chữ viết hoa hay không
    System.out.println(Character.isWhitespace(ch8));// Kiểm tra ch8 có phải là 1 khoảng trắng hay không
  }
}
