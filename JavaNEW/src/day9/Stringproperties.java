package day9;

import java.util.Arrays;

public class Stringproperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s= "Shekhee";
		String rev="";
		char a[]=s.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1; i>=0; i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		String s="Redsani";
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		//System.out.println(rev);
		StringBuffer p= new StringBuffer("Shekhee");
		//System.out.println(p.reverse());
		/*String me="Welcome";
		System.out.println(me);
        me.concat(" to Java!");
        System.out.println(me);*/
		StringBuffer o= new StringBuffer("welcome");
		o.append(" to Java");
		//System.out.println(o);
		//String s1= new String("Welcome");
		//String s2= new String("Welcome");
		//System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		String s2= "Me name is Deusdedit Makhoka";
		//char b[]= s2.toCharArray();
		//int count= 0;
		//count= count + b.length;
		//System.out.println(count);
		String b[]= s2.split(" ");
		int count= 0;
		count= count + b.length;
		System.out.println(count);
	}

}
