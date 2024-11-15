package day8;

import java.util.Arrays;

public class Stringproperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*String s= "Welcome";
        System.out.println(s.length());*/
		/*String s1= "Welcome";
		String s2= " to Java";
		String s3= " coding";
		System.out.println(s1.concat(s2+s3));*/
		String s1= "Welcome";
		//System.out.println(s1.length()); 
		s1.trim();
		//System.out.println(s1.trim().length());
		//System.out.println(s1.charAt(6));
		//System.out.println(s1.contains("wel"));
		String s2= "WELCOME";
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equalsIgnoreCase(s2));
		String s3= "Maandamano ya kibughaaa";
		//System.out.println(s3.replace("kibughaaa","shekhee!"));
		//System.out.println(s2.substring(3,7));
		//System.out.println(s2.toLowerCase());
		String s4= "abc@gmail.com";
		String a[]=s4.split("@");
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		//System.out.println(Arrays.toString(a));
		String s5= "$3,$10,$20";
		System.out.println(s5.replace("$", "").replace(",",""));
		
		
	}

}
