package day4;

public class Conditionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int a= 2394389;
        if(a%2==0) {
        	System.out.println("Even");
        }
        else {
        	System.out.println("Odd");
        }*/
		/*int a= 100, b=20, c=50;
		if(a>b&&a>c) {
			System.out.println("a is the largest number " +a);
		}
		else if(b>a&&b>c) {
			System.out.println("b is the largest number");
		}
		else {
			System.out.println("c is the largest number");
		}*/
		/*if(false) {
			System.out.println(1);
		}
		else {
			System.out.println(2);
		}*/
		/*if(true) {
			if(false) {
				System.out.println("abc");
			}
			else {
				System.out.println("xyz");
			}
		}
		else {
			System.out.println(123);
		}*/
		/*int weekno= 8;
		switch(weekno) {
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		default:System.out.println("Invalid");
		}*/
		int a= 100, b= 20;
		String result=(a>b)?"a is larger":"b is larger";
		System.out.println(result);
	}

}
