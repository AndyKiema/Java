package day15;

public class Super {
  String colour= "Black";
  void eat() {
	  System.out.println("I am eating...");
  }
}
class Cat extends Super{
	String colour= "Blue";
	void returncolour() {
		System.out.println(super.colour);
	}
	void eat() {
		super.eat();
	}
}
