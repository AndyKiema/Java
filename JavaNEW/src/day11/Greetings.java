package day11;

public class Greetings {
   //No parameter, no return value
	void m1() {
		System.out.println("Hello...");
	}
	//No parameter, returns value
    String m2() {
    	return("How are you maandam!");
    }
    //parameter, no return value
    void m3(String name){
    	System.out.println("My name is "+name);
    }
    //parameter, return value
    String m4(String job){
    	return("I am a "+job);
    }
}
