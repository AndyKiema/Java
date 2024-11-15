package day16;

interface Shape{
	int length= 10;
	int width= 20;
	
	default void square() {
		System.out.println("This is a square");
	}
	
	void circle();
	
	static void rectangle() {
		System.out.println("This is a rectangle");
	}
}

public class Interfacedemo implements Shape{
	int a= 50;
	int b= 5;
	
	public void circle() {
		System.out.println("This is a circle");
	}
	void triangle() {
		System.out.println("This is a triangle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interfacedemo id= new Interfacedemo();
		/*id.circle();
		id.square();
		Shape.rectangle();
		id.triangle();
		System.out.println(id.a+id.b);
		
		Shape sh= new Interfacedemo(); 
        sh.circle();
        sh.square();
        Shape.rectangle();
        System.out.println(Shape.length*Shape.width);*/
        
	}

}
