package day13;

public class Staticdemo {
	static int a=10;
	int b=20;
	
	static void m1() {
		System.out.println("This is a static method");
	}
	void m2() {
		System.out.println("This is a non-static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println(a);
		
		
	}

}
