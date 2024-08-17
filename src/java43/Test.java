package java43;

public class Test {
  public static void main(String[] args) {
    MyMarth myMarth = new MyMarth();
    System.out.println(myMarth.timMin(2, 3));
    System.out.println(myMarth.timMin(2.5, 1.5));
    System.out.println(myMarth.tinhTong(2.5, 1.5));
    double arr[] = new double[]{1, 4, 5, 7, 8, 9};
    System.out.println(myMarth.tinhTong(arr));
  }
}
