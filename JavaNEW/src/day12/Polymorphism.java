package day12;

public class Polymorphism {
    double width;
    double height;
    double depth;
	/*int a= 10;
	int b= 20;*/
	
	/*void sum() {
		System.out.println(a+b);
	}
    void sum(int x, int y) {
    	System.out.println(x+y);
    }
    void sum(int x, String b) {
    	System.out.println(x+b);
    }
    void sum(String c, int y) {
    	System.out.println(c+y);
    }*/
	Polymorphism(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	Double volume() {
		return(width*height);
	}
}
