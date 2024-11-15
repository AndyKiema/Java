package day14;

class a{
	int a=100;
	void display() {
		System.out.println(a);
	}
	
}
class b extends a{
	int b=200;
	void tell() {
		System.out.println(b);
	}
}
class c extends b{
	int c= 300;
	void print() {
		System.out.println(c);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//b obj= new b();
	    //System.out.println(obj.b);
		//obj.display();
		//obj.tell();
		
		c object= new c();
		object.print(); 
		//System.out.println(object.c);
		System.out.println(object.a);
		//object.tell();
		object.display();

	}

}
