package day15;

class Overriding2 {
   void print(int a) {
	   System.out.println(a);
   }
   void sum(int c,int d) {
	   System.out.println(c+d);
   }
}
class Overriding3{
	void print(int a) {
		System.out.println(a+=2);
	}
	void print(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int c, int d, int e) {
		System.out.println(c+d+e);
	}
	
}
