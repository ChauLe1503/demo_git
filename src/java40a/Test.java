package java40a;

public class Test {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();
    d.bark();
    System.out.println("--------------");
    BaByDog bbd = new BaByDog();
    d.eat();
    d.bark();
    bbd.weep();
    System.out.println("--------------");
    Cat c = new Cat();
    c.eat();
    c.meos();
    System.out.println("--------------");
    Bird b = new Bird();
    b.eat();
    b.fly();
  }
}
