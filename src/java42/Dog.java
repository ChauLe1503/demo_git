package java42;

public class Dog extends Animal {
  public Dog() {
    super("Dog");
  }

  @Override
  public void eat() {
    System.out.println("Tôi ăn xương!");
  }

  @Override
  public void makeSound() {
    System.out.println("Gâu gâu");
  }
}
