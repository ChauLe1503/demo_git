package java66;

public class TestBox2 {
  public static void main(String[] args) {
    Box2 box2 = new Box2<String>("nam");
    System.out.println("Giá trị : " + box2.getValue());
    Box2 box3 = new Box2<Double>(5.5d);
    System.out.println("Giá trị : " + box3.getValue());
    Box2 box4 = new Box2<Integer>(100);
    System.out.println("Giá trị : " + box4.getValue());
    Box2 box5 = new Box2<Float>(10.9f);
    System.out.println("Giá trị : " + box5.getValue());
  }
}
