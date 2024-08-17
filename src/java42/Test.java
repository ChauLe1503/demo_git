package java42;

public class Test {
  public static void main(String[] args) {
    System.out.println("Test dog");
    Dog dog = new Dog();
    dog.eat();
    dog.makeSound();
    dog.sleep();
    System.out.println("----------------");
    System.out.println("Test cat");
    Cat cat = new Cat();
    cat.eat();
    cat.makeSound();
    cat.sleep();
    System.out.println("----------------");
    System.out.println("Test bird");
    Bird bird = new Bird();
    bird.eat();
    bird.makeSound();
    bird.sleep();
  }
}
